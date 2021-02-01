import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest implements SpeedTest{

    PrintStream printStream;

    public PrintStreamTest(String filename) throws FileNotFoundException {
        printStream  = new PrintStream(filename);
    }

    @Override
    public void run(String text, int times) {

        for (int i = 0; i < times; i++) {
            printStream.println(text);
        }
        printStream.close();
    }

    @Override
    public void printTestName() {
        System.out.println("Print Stream Test");
    }
}
