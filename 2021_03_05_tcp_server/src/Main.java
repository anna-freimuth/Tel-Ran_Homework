import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Main {

    static int TCP_PORT = 3000;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(TCP_PORT);

        while (true) {
            //TODO Make the server async. After accepting a socket open a new thread to handle the socket.
            Socket socket = serverSocket.accept();
            System.out.println("Connected");

            PrintStream socketOutput = new PrintStream(socket.getOutputStream());
            BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            try {
                while ((line = socketInput.readLine()) != null) {
                    String response = "Handled by server " + line;
                    socketOutput.println(response);
                }
            } catch (SocketException e) {
                /* expected disconnect */
            }

            System.out.println("disconnected");
        }
    }
}
