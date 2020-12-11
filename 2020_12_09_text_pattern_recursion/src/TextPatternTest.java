import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextPatternTest {


    @Test
    public void hello_ello_true() {
        TextPattern test1 = new TextPattern("hello", "ello");

        assertTrue(test1.textPattern());
    }

    @Test
    public void hello_lelo_false() {
        TextPattern test1 = new TextPattern("hello", "lelo");

        assertFalse(test1.textPattern());
    }
}
