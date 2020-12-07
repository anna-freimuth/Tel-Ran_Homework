import java.util.Iterator;

public class BackwardsArrayIterator implements Iterator<Integer> {
    private final int[] arrayToIterate;
    private int currentIndex;

    BackwardsArrayIterator(int[] arrayToIterate) {
        this.arrayToIterate = arrayToIterate;
        this.currentIndex = arrayToIterate.length - 1;
    }


    public boolean hasNext() {
        return currentIndex >= 0;
    }

    public Integer next() {
        return arrayToIterate[currentIndex--];
    }
}
