import operation.IStringOperation;
import operation.OperationContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

import static org.mockito.Mockito.*;

public class ConsumerTest {

    OperationContext operationContext;
    BlockingQueue<String> queue;
    Consumer consumer;
    Thread consumerThread;
    PrintWriter writer;
    IStringOperation operation;

    @BeforeEach
    public void init() {
        operationContext = mock(OperationContext.class);
        operation = mock(IStringOperation.class);
        writer = mock(PrintWriter.class);
        queue= mock(BlockingQueue.class);

        consumer = new Consumer(queue, writer, operationContext);
        consumerThread = new Thread(consumer);
    }

    @Test
    public void handleRawString_wrongFormat() throws InterruptedException {
        String res = consumer.handleRawString("wrong_format");
        assertEquals("wrong_format" + consumer.wrongFormat,res);
//        queue.add("wrong_format");
//        consumerThread.start();
//        consumerThread.interrupt();
//        consumerThread.join();
//        verify(writer).println("wrong_format#wrong format");
    }
    @Test
    public void handleRawString_wrongOperation() throws InterruptedException {
        when(operationContext.getOperation("get_length")).thenReturn(null);

        String res = consumer.handleRawString("wrong_operation#get_length");
        assertEquals("wrong_operation#get_length"+ consumer.wrongOperation,res);
//        queue.add("wrong_operation#get_length");
//        consumerThread.start();
//        consumerThread.interrupt();
//        consumerThread.join();
//        verify(writer).println("wrong_operation#get_length#wrong operation");
    }

    @Test
    public void handleRawString_lowerCase() throws InterruptedException {
        when(operation.operate("hello")).thenReturn("HeLlO");
        when(operationContext.getOperation("bla_bla_operation")).thenReturn(operation);

        String res1 = consumer.handleRawString("hello#bla_bla_operation");
        assertEquals("HeLlO", res1);


        when(operation.operate("HELLO")).thenReturn("hello");
        when(operationContext.getOperation("lower_case")).thenReturn(operation);

        String res = consumer.handleRawString("HELLO#lower_case");
        assertEquals("hello",res);
//        queue.add("WORLD#lower_case");
//        when(operationContext.getOperation("lower_case")).thenReturn(new LowerCaseSO());
//        consumerThread.start();
//        consumerThread.interrupt();
//        consumerThread.join();
//        verify(writer).println("world");
    }
}
