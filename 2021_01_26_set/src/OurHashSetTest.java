import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OurHashSetTest {

    OurHashSet<Integer> set1 = new OurHashSet<>();
    OurHashSet<Integer> set2 = new OurHashSet<>();


    @Test
    void add() {

        set1.add(1);
        set1.add(2);
        set1.add(1);

        assertEquals(2, set1.size());
        for (int value : set1) {

            assertTrue(value == 1 || value == 2);
        }
    }

    @Test
    void remove() {

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        assertFalse(set1.remove(9001));
        assertEquals(4, set1.size());
        for (int value : set1) {

            assertTrue(set1.remove(value));
        }
        assertFalse(set1.remove(-5));
        assertEquals(0, set1.size());
    }

    @Test
    void contains() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        assertTrue(set1.contains(1));
        assertFalse(set1.contains(5));
    }

    @Test
    void size() {
        assertEquals(0, set1.size());
        set1.add(1);
        set1.add(2);
        assertEquals(2, set1.size());
        set1.remove(2);

        assertEquals(1, set1.size());
    }

    @Test
    void addAll() {
        set1.add(1);
        set1.add(3);
        set1.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);


        set1.addAll(set2);
        assertEquals(5, set1.size());
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(3));
        assertTrue(set1.contains(5));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(4));
    }

    @Test
    void retainAll() {
        set1.add(1);
        set1.add(3);
        set1.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        set1.retainAll(set2);
        assertTrue(set1.contains(3));
        assertEquals(1, set1.size());
    }

    @Test
    void removeAll() {
        set1.add(1);
        set1.add(3);
        set1.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        set1.removeAll(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(5));
        assertEquals(2, set1.size());
    }

    @Test
    void iterator() {

        set1.add(1);
        set1.add(2);
        set1.add(3);

        for (int value: set1) {
            set2.add(value);
        }

        assertEquals(3, set2.size());
        assertTrue(set2.contains(1));
        assertTrue(set2.contains(2));
        assertTrue(set2.contains(3));
    }
}