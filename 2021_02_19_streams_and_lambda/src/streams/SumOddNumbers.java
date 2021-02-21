package streams;

import java.util.stream.IntStream;

public class SumOddNumbers {

    public int sumOddNumbers(int a, int b) {

        return IntStream.rangeClosed(a, b).filter(number -> number % 2 != 0).sum();
    }
}
