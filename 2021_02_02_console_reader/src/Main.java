import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferReader bufferReader = new BufferReader("2021_02_02_console_reader/src/output.txt");
        bufferReader.readFromConsoleAndWriteToFile();
    }
}
