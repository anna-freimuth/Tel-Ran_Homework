package streams;

import java.util.stream.IntStream;

public class Factorial {

    public int factorial(int number) {

        return IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y);
    }
}
