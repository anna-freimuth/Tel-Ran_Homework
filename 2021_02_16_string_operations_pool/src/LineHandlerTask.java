import operation.IStringOperation;
import operation.OperationContext;

import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;

public class LineHandlerTask implements Runnable {
    private final PrintWriter writer;
    private final OperationContext context;
    private final String line;
    private Boolean supplierIsNotDone = true;

    public final String separator = "#";
    public final String wrongFormat = "#wrong format";
    public final String wrongOperation = "#wrong operation";


    public LineHandlerTask( String line,PrintWriter writer, OperationContext context) {
        this.line = line;
        this.writer = writer;
        this.context = context;

    }

    @Override
    public void run() {
            String result = handleRawString(line);
            writer.println(result);
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
