import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IncreasingArrayIteratorTest {
    int[] array = {10, -8, 0, 15};
    Iterator<Integer> iterator = new IncreasingArrayIterator(array);

    @Test
    public void increasingArrayIterator() {
        assertEquals(-8, iterator.next());
    }

    @Test
    public void iteratorEndsAfterLastElement() {

        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }

        assertEquals(4, count);
    }
}
