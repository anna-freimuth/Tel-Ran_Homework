
import java.util.Iterator;

/**
 * The implementation of the OurMap cannot contain null as a key.
 *
 * @param <K>
 * @param <V>
 */
public class OurHashMap<K, V> implements OurMap<K, V> {
    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private static final int INITIAL_CAPACITY = 16;

    private Pair<K, V>[] source;
    private int size;
    private double loadFactor;
    private int capacity; //source.length

    public OurHashMap() {
        source = new Pair[INITIAL_CAPACITY];
        capacity = INITIAL_CAPACITY;
        size = 0;
        loadFactor = DEFAULT_LOAD_FACTOR;
    }

    static int hash(Object key) {
        return Math.abs(key.hashCode());
    }

    public OurHashMap(double loadFactor) {
        this();
        this.loadFactor = loadFactor;
    }

    @Override
    public V put(K key, V value) {
        if (size >= loadFactor * capacity)
            resize();  //rehash

        Pair<K, V> pair = find(key);

        if (pair != null) {
            V res = pair.value;
            pair.value = value;
            size++;
            return res;
        }
        int index = hash(key) % capacity;
        Pair<K, V> newPair = new Pair<>(key, value, source[index]);
        source[index] = newPair;
        size++;
        return null;
    }

    private void resize() {
        capacity = capacity * 2;
        Pair<K, V>[] newSource = new Pair[capacity];


        for (Pair<K, V> cell : source) {

            Pair<K, V> currentCell = cell;
            while (currentCell != null) {
                int newIndex = hash(currentCell.key) % capacity;
                currentCell.next = newSource[newIndex];
                newSource[newIndex] = currentCell;

                currentCell = currentCell.next;
            }
        }
        source = newSource;
    }

    private Pair<K, V> find(K key) {
        int index = hash(key) % capacity;

        Pair<K, V> current = source[index];
        while (current != null) {
            if (key.equals(current.key))
                return current;
            current = current.next;
        }
        return null;
    }

    @Override
    public V get(K key) {
        Pair<K, V> pair = find(key);

        if (key.equals(pair.key))
            return pair.value;

        return null;
    }

    @Override
    public V remove(K key) {
        return null;
        // return pair != null ? pair.value : null;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<K> keyIterator() {
        return null;
    }

    @Override
    public Iterator<V> valueIterator() {
        return null;
    }

    static private class Pair<K, V> {
        K key;
        V value;
        Pair<K, V> next;

        public Pair(K key, V value, Pair<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

//        public K getKey() {
//            return key;
//        }
//
//        public V getValue() {
//            return value;
//        }
//
//        public Pair<K, V> getNext() {
//            return next;
//        }
    }
}
