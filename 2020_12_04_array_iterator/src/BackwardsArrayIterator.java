import java.util.Iterator;

public class BackwardsArrayIterator<Type> implements Iterator<Type> {
    private final Type[] arrayToIterate;
    private int currentIndex;

    BackwardsArrayIterator(Type[] arrayToIterate) {
        this.arrayToIterate = arrayToIterate;
        this.currentIndex = arrayToIterate.length - 1;
    }


    public boolean hasNext() {
        return currentIndex >= 0;
    }

    public Type next() {
        return arrayToIterate[currentIndex--];
    }
}
