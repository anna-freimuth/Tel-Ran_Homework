package streams;

import java.util.stream.IntStream;

public class PrimeNumber {

    public boolean isPrime(int number) {

        return IntStream.range(2, number).noneMatch(res -> number % res == 0);
    }

}
