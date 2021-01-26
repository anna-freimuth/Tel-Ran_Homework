import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class OurTreeMapTest extends OurMapTest {

    @BeforeEach
    public void init() {
        map = new OurTreeMap<>();
    }

    @Test
    public void testRemoveAdd_severalElements_removeRoot() {
        map.put(1, "a");
        map.put(2, "b");
        assertEquals(2, map.size());
        assertEquals("a", map.remove(1));
        assertEquals(1, map.size());
        assertEquals("b", map.get(2));
    }

    @Test
    public void testRemoveAdd_severalElements_removeRight() {
        map.put(1, "a");
        map.put(2, "b");
        assertEquals(2, map.size());
        assertEquals("b", map.remove(2));
        assertEquals(1, map.size());
        assertEquals("a", map.get(1));
    }

    @Test
    public void testKeyIterator_severalElements_increasing() {
        map.put(1, "a");
        map.put(-10, "b");
        map.put(5, "b");
        map.put(3, "b");
        map.put(-5, "b");
        map.put(2, "b");

        List<Integer> expected = Arrays.asList(-10, -5, 1, 2, 3, 5);

        List<Integer> actual = new ArrayList<>();

        Iterator<Integer> keyIterator = map.keyIterator();
        while (keyIterator.hasNext())
            actual.add(keyIterator.next());

        assertEquals(expected, actual);
    }

    @Test
    public void testKeyIterator_severalElements_rootToTheLeft() {
        map.put(-10, "b");
        map.put(-5, "b");
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "b");
        map.put(5, "b");

        List<Integer> expected = Arrays.asList(-10, -5, 1, 2, 3, 5);
        List<Integer> actual = new ArrayList<>();

        Iterator<Integer> keyIterator = map.keyIterator();
        while (keyIterator.hasNext())
            actual.add(keyIterator.next());

        assertEquals(expected, actual);
    }

    @Test
    public void testValueIterator_severalElements_increasing() {
        map.put(1, "a");
        map.put(-10, "b");
        map.put(5, "f");
        map.put(3, "e");
        map.put(-5, "d");
        map.put(2, "c");

        List<String> expected = Arrays.asList("b", "d", "a", "c", "e", "f");

        List<String> actual = new ArrayList<>();

        Iterator<String> valueIterator = map.valueIterator();
        while (valueIterator.hasNext())
            actual.add(valueIterator.next());

        assertEquals(expected, actual);
    }

    @Test
    public void testValueIterator_severalElements_rootToTheLeft() {
        map.put(-10, "a");
        map.put(-5, "b");
        map.put(1, "c");
        map.put(2, "d");
        map.put(3, "e");
        map.put(5, "f");

        List<String> expected = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> actual = new ArrayList<>();

        Iterator<String> valueIterator = map.valueIterator();
        while (valueIterator.hasNext())
            actual.add(valueIterator.next());

        assertEquals(expected, actual);
    }
}
