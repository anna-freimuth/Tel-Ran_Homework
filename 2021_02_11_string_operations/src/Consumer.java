import com.sun.corba.se.spi.orb.Operation;

import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private final BlockingQueue<String> queue;
    private final PrintWriter writer;
    private final Operation;

    public Consumer(BlockingQueue<String> queue, PrintWriter writer) {
        this.queue = queue;
        this.writer = writer;
    }

    @Override
    public void run() {
        //TODO 1.read the line from the queue
        //TODO 2.call the method handleRawString
        //TODO 3.write the resulting (transformed)string int the "writer"

    }

    String handleRawString(String line){
        //TODO complete
        //TODO if the line has wrong format then return it with the postfix '#wrong format' back."hello wold"-> (we have text, but operation does not show or used with wrong separator) ->"hello wold#wrong format"
        //TODO or "hello world#upper_case#param"-> "hello world#wrong format"

        //TODO Get the operation by its name

        //TODO if the format seems to be correct,but the operation is not found then the write to the file the line with the
        //TODO postfix'#wrong operation'.E.g."hello world#opper_case"-> "hello world#opper_case#wrong operation"

    }
}
