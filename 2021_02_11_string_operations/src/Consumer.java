import operation.IStringOperation;
import operation.OperationContext;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<String> queue;
    private final PrintWriter writer;
    private final OperationContext context;

    public final String separator = "#";
    public final String wrongFormat = "#wrong format";
    public final String wrongOperation = "#wrong operation";

    private Boolean supplierIsNotDone = true;

    public Consumer(BlockingQueue<String> queue, PrintWriter writer, OperationContext context) {
        this.queue = queue;
        this.writer = writer;
        this.context = context;
    }

    @Override
    public void run() {
            while (supplierIsNotDone) {
                try {
                    String str = queue.take();
                    String res = handleRawString(str);
                    writer.println(res);
                } catch (InterruptedException e) {
                    supplierIsNotDone = false;
                }
            }
        // !queue.isEmpty
        while (true) {
            String line;
            try {
                line = queue.remove();
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                break;
            }
            String resLine = handleRawString(line);
            writer.println(resLine);
        }

    }

    String handleRawString(String line) {
        String[] result = line.split(separator);

        if (result.length != 2)
            return line + wrongFormat;
        String operationName = result[1];
        String stringToPerform = result[0];

        IStringOperation stringOperation = context.getOperation(operationName);

        if (stringOperation == null)
            return line + wrongOperation;

        return stringOperation.operate(stringToPerform);
    }
}
