
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OurArrayListForwardIteratorTestInt {

    Iterator<Integer> iterator;

    public OurArrayListForwardIteratorTestInt() {

        OurArrayList<Integer> arrayList = new OurArrayList<>();
        int[] array = {10, -8, 0, 15};
        for (int num : array) {
            arrayList.addLast(num);
        }

        iterator = arrayList.forwardIterator();
    }

    @Test
    public void increasingArrayIterator() {
        assertEquals(10, iterator.next());
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
