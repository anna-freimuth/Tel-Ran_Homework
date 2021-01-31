package ListWordsMap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WordsTest {
    Words words = new Words();
    List<String> stringList = new ArrayList<>();

    @Test
    public void splitWordsByLetter() {

        Collections.addAll(stringList, "cat", "docker", "friend", "code", "draft", "fibre");
        List<List<String>> result = words.splitWordsByLetter(stringList);
        List<List<String>> expectedResult = new ArrayList();
        expectedResult.add(Arrays.asList("cat", "code"));
        expectedResult.add(Arrays.asList("docker", "draft"));
        expectedResult.add(Arrays.asList("fibre", "friend"));
        assertEquals(expectedResult, result);
    }
}
