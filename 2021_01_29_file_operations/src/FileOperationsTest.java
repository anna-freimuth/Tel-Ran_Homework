import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileOperationsTest {

    FileOperations fileOperations = new FileOperations();
    final String FILE_INT_INPUT = "src/int_input.txt";
    final String FILE_STR_INPUT = "src/str_input.txt";
    final String FILE_OUTPUT = "src/output.txt";

    @Test
    void writeString() throws IOException {

        List<String> testString = Arrays.asList("I am testing writing this to a file".split(" "));
        fileOperations.writeString(testString, FILE_OUTPUT);
        assertEquals(testString, fileOperations.readString(FILE_OUTPUT));

        fileOperations.writeString(testString, FILE_OUTPUT);
        assertEquals(testString, fileOperations.readString(FILE_OUTPUT));
    }

    @Test
    void readString() throws IOException {
        List<String> stringList = fileOperations.readString(FILE_STR_INPUT);
        List<String> result = Arrays.asList("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor",
                "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,",
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

        assertEquals(result, stringList);
    }

    @Test
    void writeBytes() throws IOException {

        byte[] bytes = "I am testing writing this to a file".getBytes();

        fileOperations.writeBytes(bytes, FILE_OUTPUT);
        byte[] bytesFromFile = fileOperations.readBytes(FILE_OUTPUT);
        assertEquals(new String(bytes), new String(bytesFromFile));

        fileOperations.writeBytes(bytes, FILE_OUTPUT);
        bytesFromFile = fileOperations.readBytes(FILE_OUTPUT);
        assertEquals(new String(bytes), new String(bytesFromFile));
    }

    @Test
    void readBytes() throws IOException {
        String bytes = new String(fileOperations.readBytes(FILE_INT_INPUT));
        String expected = "12 35 3534";
        assertEquals(expected, bytes);
    }

    @Test
    void writeInts() throws IOException {
        List<Integer> integerList = Arrays.asList(12, 35, 3534);
        fileOperations.writeInts(integerList, FILE_OUTPUT);

        assertEquals(integerList, fileOperations.readInts(FILE_OUTPUT));
    }

    @Test
    void readInts() throws IOException {
        List<Integer> integerList = fileOperations.readInts(FILE_INT_INPUT);

        List<Integer> expected = Arrays.asList(12, 35, 3534);
        assertEquals(expected, integerList);
    }
}
