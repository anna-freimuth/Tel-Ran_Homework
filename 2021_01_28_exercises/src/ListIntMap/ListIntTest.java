package ListIntMap;

import org.junit.jupiter.api.Test;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class ListIntTest {
    Integer[] list = new Integer[]{1, 2, 3, 4, 4, 5, 6, 6};
    ListInt listInt = new ListInt();

    @Test
    public void valueAsAmountOfRepeatingNumbers(){
        Map<Integer, Integer> map = listInt.valueAsAmountOfRepeatingNumbers(list);

        assertEquals(1, map.get(1));
        assertEquals(1, map.get(2));
        assertEquals(1, map.get(3));
        assertEquals(2, map.get(4));
        assertEquals(1, map.get(5));
        assertEquals(2, map.get(6));
    }
}
