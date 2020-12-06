import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IncreasingArrayIteratorTest {
    Integer[] array = {10, -8, 0, 15};
    IncreasingArrayIterator<Integer> iterator = new IncreasingArrayIterator<Integer>(array);

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
