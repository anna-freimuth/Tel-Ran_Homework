import java.util.ArrayDeque;
import java.util.Comparator;

public class StackMax <T>{
    private ArrayDeque<T> source = new ArrayDeque<>();
    private ArrayDeque<T> currentMax = new ArrayDeque<>();
    private Comparator<T> comparator;

    public StackMax(Comparator<T> comparator) {
        this.comparator = comparator;
    }


    public void addLast(T element) {
        if (source.size() == 0)
            currentMax.addLast(element);
        else if(comparator.compare(element, getLast()) >= 0)
            currentMax.addLast(element);

        source.addLast(element);
    }


    public T getLast() {
        if (source.size() == 0)
            throw new EmptyStackException();

        return source.getLast();
    }

    public T removeLast() {
        if (source.size() == 0)
            throw new EmptyStackException();

        if(comparator.compare(getMax(),getLast()) == 0)
            currentMax.removeLast();
        return source.removeLast();
    }

    public int size() {
        return source.size();
    }

    public T getMax() {

        if (source.size() == 0)
            throw new EmptyStackException();

        return currentMax.getLast();
        /* int max = source.getFirst();
        for (Integer element : source) {
            max = Math.max(max, element);
        }
        return max; */
    }
}
