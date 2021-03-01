package collector;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RootMeanSquaringCollectorTest {
    RootMeanSquaringCollector rootMeanSquaringCollector = new RootMeanSquaringCollector();
    @Test
    public void test_collect_case2() {
        Stream<Double> numbers = Stream.of(1.0, 0.0);
        assertEquals(0.70710678, numbers.collect(rootMeanSquaringCollector), 0.00001);
    }
}
