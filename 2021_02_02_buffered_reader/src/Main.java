import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
       // List<String> fromFile = readFile("2021_02_02_buffered_reader/src/text.txt");
       // System.out.println(fromFile);
        readFromConsole();
    }

    //reads from file
    public static List<String> readFile(String filename) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            List<String> result = new ArrayList<>();
            String line;
            while((line = br.readLine()) != null){//before every iteration it reads string from file(null means ends of file) and comparing it with null
                result.add(line);
            }
            return result;
        }
    }

    //reads from console
    public static void readFromConsole() throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String line;
            while((line = br.readLine()) != null && !line.equals("exit")){
                System.out.println(line);
            }
        }
    }
}
