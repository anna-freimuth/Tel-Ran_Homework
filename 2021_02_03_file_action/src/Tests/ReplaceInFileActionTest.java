import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ReplaceInFileActionTest {

    FileOperations fileOperations;
    ReplaceInFileAction replace;

    @BeforeEach
    public void init() {
        fileOperations = mock(FileOperations.class);
        replace = new ReplaceInFileAction(fileOperations, " ", "*");
    }

    @Test
    public void test_perform() {
        ArrayList<String> exp = new ArrayList<>(Arrays.asList("212*8506", "xx*x", "40*4", "1*12"));
        assertEquals(exp, replace.perform(Arrays.asList("212 8506", "xx x", "40 4", "1 12")));
    }
}
