import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MessageSupplier implements Runnable {

    private OneItemStringQueue queue;

    public MessageSupplier(OneItemStringQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            readConsole();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readConsole() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null && !line.equals("exit")) {
                queue.addFirst(line);
            }
        }
    }
}
