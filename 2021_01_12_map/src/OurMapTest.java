import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class OurMapTest {
    OurMap<Integer, String> map;

    @Test
    void remove() {
        map.put(1, "1");
        map.put(15, "15");
        map.put(25, "25");

        map.remove(15);
        assertEquals(2, map.size());
    }


    @Test
    void put() {
        map.put(1, "1");
        map.put(15, "15");
        map.put(25, "25");

        assertEquals("25", map.get(25));
    }

    @Test
    void get() {
        map.put(1, "1");
        map.put(15, "15");

        assertEquals("15", map.get(15));
    }

    @Test
    void containsKey() {
        map.put(1, "1");
        map.put(15, "15");
        map.put(25, "25");

        assertTrue(map.containsKey(15));
    }

    @Test
    void containsKey_noActualKey() {
        map.put(1, "1");
        map.put(15, "15");
        map.put(25, "25");

        assertFalse(map.containsKey(20));
    }


    @Test
    void size() {
        map.put(1, "1");
        map.put(15, "15");
        map.put(25, "25");
        assertEquals(3, map.size());

        map.put(26, "26");
        assertEquals(4, map.size());

        map.remove(1);
        map.remove(15);
        assertEquals(2, map.size());
    }

    @Test
    void size_emptyMap() {
        assertEquals(0, map.size());
    }
}
