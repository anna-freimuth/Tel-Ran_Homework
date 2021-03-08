import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    static int TCP_PORT = 3000;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(TCP_PORT);

        ExecutorService clientPool = Executors.newFixedThreadPool(5);

        //noinspection InfiniteLoopStatement
        while (true) {
            Socket socket = serverSocket.accept();
            clientPool.execute(new SocketThread(socket));
        }
    }
}