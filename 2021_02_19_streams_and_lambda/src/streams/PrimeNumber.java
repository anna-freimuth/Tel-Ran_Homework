package streams;

import java.util.stream.IntStream;

public class PrimeNumber {
    /**
     * the method determines whether the number is prime
     * @param number must be greater than zero
     * @return true if the number is prime, false otherwise
     */
    public boolean isPrime(int number) {

        if(number ==1) return false;
        return IntStream.range(2, number).noneMatch(divisor -> number % divisor == 0);
    }

}
