import java.util.ArrayDeque;

public class StackMax {
    private ArrayDeque<Integer> source = new ArrayDeque<>();
    private ArrayDeque<Integer> currentMax = new ArrayDeque<>();

    public void addLast(int element) {
        if (source.size() == 0)
            currentMax.addLast(element);
        else
            currentMax.addLast(Math.max(getMax(), element));
        source.addLast(element);
    }

    public int getLast() {
        if (source.size() == 0)
            throw new EmptyStackException();

        return source.getLast();
    }

    public int removeLast() {
        if (source.size() == 0)
            throw new EmptyStackException();

        currentMax.removeLast();
        return source.removeLast();
    }

    public int size() {
        return source.size();
    }

    public int getMax() {

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
