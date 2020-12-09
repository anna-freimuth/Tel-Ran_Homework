import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCipherTest {

    @Test
    public void stringCipher_aaabbcddd_a3b2cd3() {
        StringCipher str1 = new StringCipher("aaabbcddd");
        assertEquals("a3b2cd3", str1.stringCipher());
    }

    @Test
    public void stringCipher_aabbcddda_a2b2cd3a() {
        StringCipher str1 = new StringCipher("aabbcddda");
        assertEquals("a2b2cd3a", str1.stringCipher());
    }

    @Test
    public void stringCipher_aaabbccccdddc_a3b2c4d3c() {
        StringCipher str1 = new StringCipher("aaabbccccdddc");
        assertEquals("a3b2c4d3c", str1.stringCipher());
    }
}
