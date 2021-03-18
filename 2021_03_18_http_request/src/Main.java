import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        httpConnectToLowLevel();
        httpConnectToHighLevel();
    }

    private static void httpConnectToHighLevel() throws IOException {
        URL url = new URL("http://google.com:80");
        BufferedReader urlIn = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ((line = urlIn.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void httpConnectToLowLevel() throws IOException {
        Socket socket = new Socket("google.com", 80);
        PrintStream socketOut = new PrintStream(socket.getOutputStream());
        BufferedReader socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        socketOut.println("GET / HTTP/1.1");
        socketOut.println("Host: www.google.com");
        socketOut.println();

        String line;
        while ((line = socketIn.readLine()) != null) {
            System.out.println(line);
        }
    }
}
