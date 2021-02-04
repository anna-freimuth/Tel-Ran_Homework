import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CapitalLetterFileActionTest {

    FileOperations fileOperations;
    CapitalLetterFileAction capLet = new CapitalLetterFileAction(new FileOperations());


    @BeforeEach
    public void init() {
        fileOperations = mock(FileOperations.class);
        capLet = new CapitalLetterFileAction(fileOperations);
    }

    @Test
    public void test_perform_lowerCase() {
        ArrayList<String> exp = new ArrayList<>(Arrays.asList("APPLE", "BANANA", "APRICOT", "CHERRY"));
        assertEquals(exp, capLet.perform(Arrays.asList("apple", "banana", "apricot", "cherry")));
    }

    @Test
    public void test_perform_mixedCase() {
        ArrayList<String> exp = new ArrayList<>(Arrays.asList("APPLE", "BANANA", "APRICOT", "CHERRY"));
        assertEquals(exp, capLet.perform(Arrays.asList("aPPle", "Banana", "Apricot", "cheRRY")));
    }
}
