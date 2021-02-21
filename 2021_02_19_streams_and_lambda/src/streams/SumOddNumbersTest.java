package streams;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SumOddNumbersTest {
    SumOddNumbers sumOddNumbers = new SumOddNumbers();

    @Test
  public void setSumOddNumbers_between_2_and_10(){
        int res = sumOddNumbers.sumOddNumbers(2,10);
        int expected =  24;

        assertEquals(expected,res);
    }
}
