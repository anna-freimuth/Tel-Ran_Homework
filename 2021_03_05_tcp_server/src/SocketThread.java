import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;

public class SocketThread implements Runnable {

    private final Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        System.out.println("Connected");

        try {
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
        } catch (IOException ioException) {
            /* do nothing */
        }

        System.out.println("Disconnected");
    }
}

