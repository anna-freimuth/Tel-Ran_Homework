import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest implements SpeedTest{

    PrintStream printStream;

    public PrintStreamTest(String filename) throws FileNotFoundException {
        printStream  = new PrintStream(filename);
    }

    @Override
    public void run(String text) {
        printStream.println(text);
    }

    @Override
    public void close() {
    printStream.close();
    }

    @Override
    public void printTestName() {
        System.out.println("Print Stream Test");
    }
}
