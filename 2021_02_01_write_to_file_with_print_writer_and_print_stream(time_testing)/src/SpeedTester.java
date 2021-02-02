import java.io.IOException;
import java.util.List;

public class SpeedTester {
    List<SpeedTest> speedTests;
    int times;
    String text;
    String filename;

    public SpeedTester(List<SpeedTest> speedTests, int times, String text, String filename) {
        this.speedTests = speedTests;
        this.times = times;
        this.text = text;
        this.filename = filename;
    }

    public void test() throws IOException {
        for (SpeedTest test : speedTests) {
            test.printTestName();
            long before = System.currentTimeMillis();
            test.run(text, times, filename);
            long after = System.currentTimeMillis() - before;
            System.out.println(after + " ms");
        }
    }
}
