import map.OurHashMap;

import java.util.Iterator;

public class OurHashSet<T> implements OurSet<T> {

    private OurHashMap<T, Object> source = new OurHashMap<>();
    private final Object stubValue = new Object();

    @Override
    public boolean add(T elt) {
        return source.put(elt,stubValue) == null;
    }

    @Override
    public boolean remove(T elt) {
        return source.remove(elt)!= null;
    }

    @Override
    public boolean contains(T elt) {
        return source.containsKey(elt);
    }

    @Override
    public int size() {
        return source.size();
    }

    @Override
    public void addAll(OurSet<T> another) {
        for (T value: another) {
            add(value);
        }
    }

    @Override
    public void retainAll(OurSet<T> another) {
        for (T value: this) {
            if (!another.contains(value)) remove(value);
        }
    }

    @Override
    public void removeAll(OurSet<T> another) {
        for (T value: another) {
            remove(value);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return source.keyIterator();
    }
}
