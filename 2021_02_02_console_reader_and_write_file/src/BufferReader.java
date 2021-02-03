import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BufferReader {
    String line;
    String filename;
    List<String> result = new ArrayList<>();

    public BufferReader(String filename) {
        this.filename = filename;
    }

    public void readFromConsoleAndWriteToFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while ((line = br.readLine()) != null && !line.equals("exit")) {

                result.add(line);
            }
            writeToFile();
        }
    }

    public void writeToFile() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(filename)) {
            for(String string : result){
                printWriter.println(string);
            }
        }
    }
}
