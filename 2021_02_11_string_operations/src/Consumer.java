import operation.IStringOperation;
import operation.OperationContext;
import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<String> queue;
    private final PrintWriter writer;
    private final OperationContext context;

    private final String separator = "#";
    private final String wrongFormat = "#wrong format";
    private final String wrongOperation = "#wrong operation";

    public Consumer(BlockingQueue<String> queue, PrintWriter writer, OperationContext context) {
        this.queue = queue;
        this.writer = writer;
        this.context = context;
    }

    @Override
    public void run() {
        try {
            while (true) {
                writer.println(handleRawString(queue.take()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String handleRawString(String line) {
        String[] result = line.split(separator);
        String operationName = result[1];
        String stringToPerform = result[0];

        if (result.length != 2)
            return line + wrongFormat;

        IStringOperation stringOperation = context.getOperation(operationName);

        if (stringOperation == null)
            return line + wrongOperation;

        return stringOperation.operate(stringToPerform);
    }
}
