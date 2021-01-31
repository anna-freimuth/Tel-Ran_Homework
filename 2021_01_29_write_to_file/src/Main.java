import java.io.FileOutputStream;
import java.io.IOException;


public class Main {

    final static String FILE_NAME = "output.txt";

    public static void main(String[] args) throws IOException {
        String hello = "Hello world!";
        FileOutputStream outputStream = new FileOutputStream(FILE_NAME, true);

        outputStream.write(hello.getBytes());
        outputStream.close();
    }
}
