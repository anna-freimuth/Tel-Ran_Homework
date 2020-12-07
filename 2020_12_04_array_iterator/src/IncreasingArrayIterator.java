
import java.util.Arrays;
import java.util.Iterator;

public class IncreasingArrayIterator implements Iterator<Integer> {
    private final int[] arrayToIterate;
    private int currentIndex;

    IncreasingArrayIterator(int[] arrayToIterate) {

        this.arrayToIterate = Arrays.copyOf(arrayToIterate, arrayToIterate.length);
        Arrays.sort(this.arrayToIterate);
    }

    public boolean hasNext() {
        return currentIndex < arrayToIterate.length;
    }

    public Integer next() {
        return arrayToIterate[currentIndex++];
    }
}
