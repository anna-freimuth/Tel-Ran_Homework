package HW003;

public class ArrayIntegerList implements IntegerList {

    private static final int INITIAL_CAPACITY = 16;

    private int size;
    int[] source;

    public ArrayIntegerList() {
        source = new int[INITIAL_CAPACITY];
    }

    @Override
    public void addLast(int element) {
        if (size == source.length)// check if size at capacity(full)
            increaseCapacity();

        //source[size++] = element;
        source[size] = element;
        size++;
    }

    void increaseCapacity() {
        int newCapacity = source.length * 2;
        int[] newSource = new int[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }

    @Override
    public int get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return source[index];
    }

    @Override
    public void set(int index, int value) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        source[index] = value;
    }

    @Override
    public int removeById(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        int value = source[index];
        //noinspection ManualArrayCopy
        for (int i = index + 1; i < size; i++) source[i - 1] = source[i];
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }
}
