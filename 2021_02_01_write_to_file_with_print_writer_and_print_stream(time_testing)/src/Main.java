import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<SpeedTest> tests = new ArrayList<>();

        tests.add(new PrintWriterTest());
        tests.add(new PrintStreamTest());


        SpeedTester speedTester = new SpeedTester(
                tests,
                100000,
                "Hello, I am a String.",
                "2021_02_01_write_to_file_with_print_writer_and_print_stream(time_testing)/src/output.txt"
        );
        speedTester.test();
    }
}
