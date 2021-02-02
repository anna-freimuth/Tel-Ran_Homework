import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest implements SpeedTest {

    @Override
    public void run(String text, int times, String filename) throws IOException {

        try (PrintStream printStream = new PrintStream(filename)) {
            for (int i = 0; i < times; i++) {
                printStream.println(text);
            }
        }
    }

    @Override
    public void printTestName() {
        System.out.println("Print Stream Test");
    }
}
