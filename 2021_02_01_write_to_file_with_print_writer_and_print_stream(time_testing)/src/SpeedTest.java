import java.io.IOException;

public interface SpeedTest {
    void run(String text, int times, String filename) throws IOException;

    void printTestName();
}
