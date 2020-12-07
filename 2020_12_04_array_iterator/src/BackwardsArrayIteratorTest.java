import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackwardsArrayIteratorTest {
    int[] array = {10, -8, 0, 15};
    Iterator<Integer> iterator = new BackwardsArrayIterator(array);

    @Test
    public void backwardsArrayIterator() {

        assertEquals(15, iterator.next());
        assertEquals(0, iterator.next());
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
