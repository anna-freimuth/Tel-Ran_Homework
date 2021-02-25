import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CensorTest {

    Set<String> dictionary = new HashSet<>();
    Censor censor = new Censor(dictionary);


    @BeforeEach
    public void init(){
        dictionary.add("apple");
        dictionary.add("fruit");
    }

    @Test
    void verify_test_False(){
        String apple = "An apple is edible";
        String appleCapitalised = "that grows on an APPLE tree";
        String fruit = "and is a very tasty fruit";
        String multipleHits = "which is why I like the fruit apple the best";

        assertFalse(censor.verify(apple));
        assertFalse(censor.verify(appleCapitalised));
        assertFalse(censor.verify(fruit));
        assertFalse(censor.verify(multipleHits));
    }
    @Test
    void verify_test_True(){
        String text = "The tomato is the edible berry of the plant Solanum lycopersicum";
        String compositeWordApple = "it does not fit into an apple-pie";

        assertTrue(censor.verify(text));
        assertTrue(censor.verify(compositeWordApple));
    }
}
