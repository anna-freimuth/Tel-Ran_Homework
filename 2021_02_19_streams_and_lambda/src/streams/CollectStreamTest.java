package streams;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;


public class CollectStreamTest {
    CollectStream collectStream = new CollectStream();
    IntStream even = IntStream.of(24, 4, 90, 60);
    IntStream odd = IntStream.of(55, 15, 39, 75);
    //filter and sorted 15,60,75,90 -> skip 75,90

    @Test
    public void collectSpecialStreamTrue() {

        int[] expected = new int[]{75, 90};
        int[] result = collectStream.collectSpecialStream(even, odd).toArray();

        assertArrayEquals(expected, result);
    }
}
