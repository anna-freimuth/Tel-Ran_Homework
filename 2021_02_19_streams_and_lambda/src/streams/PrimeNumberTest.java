package streams;


import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {
    PrimeNumber primeNumber = new PrimeNumber();

    @Test
    public void isPrime_true_test() {

        assertTrue(primeNumber.isPrime(5));
        assertTrue(primeNumber.isPrime(7));
        assertTrue(primeNumber.isPrime(11));
    }

    @Test
    public void isPrime_false_test() {

        assertFalse(primeNumber.isPrime(6));
        assertFalse(primeNumber.isPrime(8));
        assertFalse(primeNumber.isPrime(40));
    }

    @Test
    public void isPrime_1_false_test() {

        assertFalse(primeNumber.isPrime(1));
    }

}
