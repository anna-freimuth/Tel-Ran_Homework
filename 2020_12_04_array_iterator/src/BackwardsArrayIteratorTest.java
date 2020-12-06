import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackwardsArrayIteratorTest {
    BackwardsArrayIterator<Integer> iterator = new BackwardsArrayIterator<Integer>(new Integer[]{10, -8, 0, 15});

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
