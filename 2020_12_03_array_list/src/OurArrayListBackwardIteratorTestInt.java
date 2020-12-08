
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OurArrayListBackwardIteratorTestInt {

    Iterator<Integer> iterator;

    public OurArrayListBackwardIteratorTestInt() {

        OurArrayList<Integer> arrayList = new OurArrayList<>();
        int[] array = {10, -8, 0, 15};
        for (int num : array) {
            arrayList.addLast(num);
        }

        iterator = arrayList.backwardIterator();
    }

    @Test
    public void increasingArrayIterator() {
        assertEquals(15, iterator.next());
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
