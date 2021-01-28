package ListNumbersSet;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ListNumbersTest {

    Integer[] list = new Integer[]{1, 2, 3, 4, 4, 5, 6, 6};
    ListNumbers listNumbers = new ListNumbers();

    @Test
    public void uniqueListOfNumbers() {

        Set<Integer> set = listNumbers.uniqueListOfNumbers(list);
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertTrue(set.contains(4));
        assertTrue(set.contains(5));
        assertTrue(set.contains(6));

        assertEquals(6, set.size());
    }
}
