import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<SpeedTest> tests = new ArrayList<>();


        tests.add(new PrintWriterTest("2021_02_01_write_to_file_with_print_writer_and_print_stream(time_testing)/src/writer_output.txt"));
        tests.add(new PrintStreamTest("2021_02_01_write_to_file_with_print_writer_and_print_stream(time_testing)/src/stream_output.txt"));


        SpeedTester speedTester = new SpeedTester(tests,100000,"Hello, I am a String.");
        speedTester.test();
    }
}
