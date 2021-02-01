import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterTest implements SpeedTest {

    PrintWriter printWriter;

    public PrintWriterTest(String filename) throws FileNotFoundException {
        printWriter = new PrintWriter(filename);
    }

    @Override
    public void run(String text) {
        printWriter.println(text);
    }

    @Override
    public void close() {
        printWriter.close();
    }

    @Override
    public void printTestName() {
        System.out.println("Print Writer Test");
    }
}
