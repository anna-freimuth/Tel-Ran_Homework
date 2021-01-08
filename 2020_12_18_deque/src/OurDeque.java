import java.util.Iterator;

/**
 * The implementations of the interface should be able to work with the last and the first
 * elements efficiently. Namely, add, remove, and get
 *
 * @param <T> the typ of the elements stored in the deque
 */

public interface OurDeque<T> extends Iterable<T> {
    /**
     * @param elt
     * throws DequeOverflowException ,if the implementation is may contain limited number of elements
     */

    void addFirst(T elt);

    T getFirst();

    T removeFirst();

    void addLast(T elt);

    T getLast();

    T removeLast();

    int size();


    Iterator<T> forwardIterator();

    Iterator<T> backwardIterator();

}
