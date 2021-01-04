import java.util.ArrayDeque;

public class StackMax {
    private ArrayDeque<Integer> source = new ArrayDeque<>();

    public void addLast(int element) {

        source.addLast(element);
    }

    public int getLast() {
        return source.getLast();
    }

    public int removeLast() {
        return source.removeLast();
    }

    public int size() {
        return source.size();
    }

    public int getMax() throws Exception {

        if(source.size() == 0)
            throw new Exception();

        int max = source.getFirst();
        for (Integer element: source) {
            max = Math.max(max, element);
        }
        return max;
    }
}
