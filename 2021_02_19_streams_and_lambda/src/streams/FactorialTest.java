package streams;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void factorial_of_3(){
        assertEquals(6,factorial.factorial(3));
    }
    @Test
    public void factorial_of_10(){
        assertEquals(3628800,factorial.factorial(10));
    }
}
