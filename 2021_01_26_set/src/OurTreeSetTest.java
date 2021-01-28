import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OurTreeSetTest extends OurSetTest {
    @BeforeEach
    public void init() {
        set1 = new OurTreeSet<>();
        set2 = new OurTreeSet<>();
    }

    @Test
    public void test_keyIterator_correctOrder() {
        set1.add(33);
        set1.add(-5);
        set1.add(0);
        set1.add(12);
        Iterator<Integer> iterator = set1.iterator();
        ArrayList<Integer> exp = new ArrayList<>();
        Collections.addAll(exp, -5, 0, 12, 33);
        ArrayList<Integer> actual = new ArrayList<>();

        while (iterator.hasNext()) {
            actual.add((Integer) iterator.next());
        }
        assertEquals(exp, actual);
    }
}
