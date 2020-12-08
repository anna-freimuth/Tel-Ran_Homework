import java.util.Iterator;

public class OurArrayList<Type> implements OurList<Type> {

    private static final int INITIAL_CAPACITY = 16;

    private int size;
    private Object[] source;

    public OurArrayList() {
        source = new Object[INITIAL_CAPACITY];
    }

    @Override
    public void addLast(Type element) {     // O(1)
        if (size == source.length)
            increaseCapacity();
        source[size] = element;
        size++;
    }

    void increaseCapacity() {                //O(n)
        int newCapacity = source.length * 2;
        Object[] newSource = new Object[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }

    @Override
    public Type get(int index) {             // O(1)
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return (Type) source[index];
    }

    @Override
    public void set(int index, Type value) {        //O(1)
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        source[index] = value;
    }

    @Override
    public Type removeById(int index) {  // O(n)
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        Type res = (Type) source[index];
        System.arraycopy(source, index + 1, source, index, size - index - 1);
        source[size - 1] = null;
        size--;
        return res;
    }

    @Override
    public int size() {
        return size;
    }                        // O(1)

    @Override
    public void clear() {                                    // 0(1)
        source = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean remove(Type obj) {                       // 0(n)
        for (int i = 0; i < source.length; i++) {
            if (source[i].equals(obj)) {
                removeById(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Type obj) {                         // 0(n)
        for (int i = 0; i < size; i++) {
            if (source[i].equals(obj))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<Type> forwardIterator() {                   // 0(1)
        Iterator<Type> iterator = new ForwardIterator();
        return iterator;
    }

    @Override
    public Iterator<Type> backwardIterator() {                 // 0(1)
        Iterator<Type> iterator = new BackwardIterator<>((Type[]) source, size);
        return iterator;
    }

    private class ForwardIterator implements Iterator<Type> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {           // 0(1)
            return currentIndex < size;
        }

        @Override                          // 0(1)
        public Type next() {
            if (currentIndex >= size)
                throw new IndexOutOfBoundsException();

            Type res = (Type) source[currentIndex];
            currentIndex++;
            return res;
        }
    }

    private static class BackwardIterator<O> implements Iterator<O> {
        int currentIndex;
        O[] source;

        public BackwardIterator(O[] source, int size) {
            this.source = source;
            currentIndex = size - 1;
        }

        @Override
        public boolean hasNext() {           // O(1)
            return currentIndex >= 0;
        }

        @Override
        public O next() {                 // O(1)
            if (currentIndex < 0)
                throw new IndexOutOfBoundsException();

            O res = source[currentIndex];
            currentIndex--;
            return res;
        }
    }
}
