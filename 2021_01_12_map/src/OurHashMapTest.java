
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest {

    OurHashMap<Integer, String> map = new OurHashMap<>();

    @Test
    void remove() {
        map.put(1, "cat");
        map.put(15, "dog");
        map.put(25, "monkey");

        map.remove(15);
        assertEquals(2, map.size());

    }

    @Test
    void put() {
        map.put(1, "cat");
        map.put(15, "dog");
        map.put(25, "monkey");

        assertEquals("monkey", map.get(25));
    }

}


