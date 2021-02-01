import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintTest {
    final static String FILE_OUTPUT = "2021_02_01_write_to_file_with_print_writer_and_print_stream(time_testing)/src/output.txt";

    public static void main(String[] args) throws IOException {
        testPrintWriter(100000, "Hi, I am String");
        testPrintStream(100000,"Hi, I am String");
    }

    public static void testPrintWriter(int times, String text) throws IOException {

        PrintWriter printWriter = new PrintWriter(FILE_OUTPUT);

        long beforeTest = System.currentTimeMillis();
        for (int i = 0; i < times; i++)
            printWriter.println(text);
        long timeTest = System.currentTimeMillis()-beforeTest;

        printWriter.close();
        System.out.println(timeTest + " time for print writer");
    }
    public static void testPrintStream(int times, String text) throws IOException {

        PrintStream printStream = new PrintStream(FILE_OUTPUT);

        long beforeTest = System.currentTimeMillis();
        for (int i = 0; i < times; i++)
            printStream.println(text);
        long timeTest = System.currentTimeMillis()-beforeTest;

        printStream.close();
        System.out.println(timeTest + " time for print stream");
    }
}
