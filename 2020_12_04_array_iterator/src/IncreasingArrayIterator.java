import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;

public class IncreasingArrayIterator<Type> implements Iterator<Type> {
    private final Type[] arrayToIterate;
    private int currentIndex = 0;

    IncreasingArrayIterator(Type[] arrayToIterate) {

        // Why is the next line not allowed?
        // Type[] copiedArray = new Type[arrayToIterate.length];
        Type[] copiedArray = Arrays.copyOf(arrayToIterate, arrayToIterate.length);
        System.arraycopy(arrayToIterate, 0, copiedArray, 0, arrayToIterate.length);
        Arrays.sort(copiedArray);
        this.arrayToIterate = copiedArray;
    }

    public boolean hasNext() {
        return currentIndex < arrayToIterate.length;
    }

    public Type next() {
        return arrayToIterate[currentIndex++];
    }
}
