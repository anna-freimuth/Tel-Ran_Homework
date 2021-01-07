import java.util.Iterator;

public class OurFixedArrayDeque<T> implements OurDeque<T> {

    private int firstEltId;
    private int size;
    private Object[] source;
    private int capacity;

    public OurFixedArrayDeque(int initialCapacity) {
        this.source = new Object[initialCapacity];
        this.capacity = source.length;
    }

    @Override
    public void addFirst(T elt) {
        if (size == source.length)
            throw new DequeOverflowException();

        // if (firstEltId > 0)
        //  firstEltId--;
        // else
        //  firstEltId = capacity - 1;

        firstEltId = (firstEltId + capacity - 1) % capacity;
        source[firstEltId] = elt;
        size++;
    }

    @Override
    public T getFirst() {
        if (size == 0)
            throw new EmptyDequeException();

        return (T) source[firstEltId];
    }

    @Override
    public T removeFirst() {
        if (size == 0)
            throw new EmptyDequeException();
        T res = (T) source[firstEltId];
        source[firstEltId] = null;
        firstEltId = (firstEltId + 1) % capacity;
        size--;
        return res;
    }

    @Override
    public void addLast(T elt) {
        if (size == source.length)
            throw new DequeOverflowException();

        //int index = (firstEltId + size) % capacity;
        int index = (firstEltId + size++) % capacity;
        source[index] = elt;
        //size++;
    }

    @Override
    public T getLast() {
        if (size == 0)
            throw new EmptyDequeException();
        int lastIndex = (firstEltId + size - 1) % capacity;
        return (T) source[lastIndex];
    }

    @Override
    public T removeLast() {
        if (size == 0)
            throw new EmptyDequeException();

        int lastIndex = (firstEltId + size - 1) % capacity;
        T res = (T) source[lastIndex];
        source[lastIndex] = null;
        size--;
        return res;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public Iterator<T> forwardIterator() {
        Iterator<T> iterator = new ForwardIterator();
        return iterator;
    }

    @Override
    public Iterator<T> backwardIterator() {
        Iterator<T> iterator = new BackwardIterator();
        return iterator;
    }

    @Override
    public Iterator<T> iterator() {
        return forwardIterator();
    }

    public class ForwardIterator implements Iterator<T> {
        int currentIndex = firstEltId;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (currentIndex >= size)
                throw new IndexOutOfBoundsException();

            T res = (T) source[currentIndex];
            currentIndex++;
            return res;
        }
    }

    private class BackwardIterator implements Iterator<T> {
        int currentIndex = (firstEltId + size - 1) % capacity;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public T next() {
            if (currentIndex < 0)
                throw new IndexOutOfBoundsException();

            T res = (T) source[currentIndex];
            currentIndex--;
            return res;
        }
    }


    public int getMax() {
        if (size == 0)
            throw new EmptyDequeException();

        int max = (int) source[firstEltId];
        for (int i = 1; i < size; i++) {
            max = Math.max(max, (int) source[(firstEltId + i) % capacity]);
        }
        return max;
    }
}
