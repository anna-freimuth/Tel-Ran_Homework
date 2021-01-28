public interface OurSet<T> extends Iterable<T> {
    boolean add(T elt);

    boolean remove(T elt);

    boolean contains(T elt);

    int size();

    default void addAll(OurSet<T> another) {
        for (T value : another) {
            add(value);
        }
    }

    void retainAll(OurSet<T> another);

    default void removeAll(OurSet<T> another) {
        for (T value : another) {
            remove(value);
        }
    }
}
