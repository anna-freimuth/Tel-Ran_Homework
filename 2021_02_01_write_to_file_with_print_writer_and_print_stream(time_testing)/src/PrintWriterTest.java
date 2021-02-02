import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest implements SpeedTest {

    @Override
    public void run(String text, int times, String filename) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(filename)) {
            for (int i = 0; i < times; i++) {
                printWriter.println(text);
            }
        }
    }

    @Override
    public void printTestName() {
        System.out.println("Print Writer Test");
    }
}
