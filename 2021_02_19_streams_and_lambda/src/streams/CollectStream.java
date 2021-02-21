package streams;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class CollectStream {
    public IntStream collectSpecialStream(IntStream even, IntStream odd) {
        IntPredicate rule = (number) -> number % 15 == 0;
        return IntStream.concat(even, odd)
                .filter(rule)
                .sorted()
                .skip(2);
    }
}
