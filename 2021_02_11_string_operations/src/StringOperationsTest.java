import operation.LowerCaseSO;
import operation.OperationContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.mockito.Mockito.*;

public class StringOperationsTest {

    OperationContext operationContext;
    BlockingQueue<String> queue = new LinkedBlockingQueue<>();
    Consumer consumer;
    Thread consumerThread;
    PrintWriter writer;

    @BeforeEach
    public void init() {
        operationContext = mock(OperationContext.class);
        writer = mock(PrintWriter.class);

        consumer = new Consumer(queue, writer, operationContext);
        consumerThread = new Thread(consumer);
    }

    @Test
    public void handleRawString_wrongFormat() throws InterruptedException {
        queue.add("wrong_format");
        consumerThread.start();
        consumerThread.interrupt();
        consumerThread.join();
        verify(writer).println("wrong_format#wrong format");
    }
    @Test
    public void handleRawString_wrongOperation() throws InterruptedException {
        queue.add("wrong_operation#get_length");
        consumerThread.start();
        consumerThread.interrupt();
        consumerThread.join();
        verify(writer).println("wrong_operation#get_length#wrong operation");
    }

    @Test
    public void handleRawString_lowerCase() throws InterruptedException {
        queue.add("WORLD#lower_case");
        when(operationContext.getOperation("lower_case")).thenReturn(new LowerCaseSO());
        consumerThread.start();
        consumerThread.interrupt();
        consumerThread.join();
        verify(writer).println("world");
    }
}
