package collector;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NormalizingCollectorTest {

    NormalizingCollector normalizingCollector = new NormalizingCollector();

    @Test
    public void testCollect(){
        Stream<Double> numbers = Stream.of(5.0, 0.0, 10.0);
        List<Double> exp = Arrays.asList(0.5, 0.0, 1.0);

        List<Double> res = numbers.collect(normalizingCollector);
        int i = 0;
        for (double number : res) {
            assertEquals(exp.get(i++), number, 0.00001);
        }
        assertEquals(3, i);
    }
}
