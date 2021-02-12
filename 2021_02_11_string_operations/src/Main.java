import operation.OperationContext;

import java.io.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    final static String INPUT = "2021_02_11_string_operations/src/input.txt";
    final static String OUTPUT = "2021_02_11_string_operations/src/output.txt";

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
//TODO read the props file and retrieve the operation paths from it. Then create an instance of the PerationContext
        //TODO using these paths.
        OperationContext operationContext = new OperationContext();

        BufferedReader br = new BufferedReader(new FileReader(INPUT));
        PrintWriter writer = new PrintWriter(new FileOutputStream(OUTPUT));
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();


        Thread consumerThread1 = new Thread(new Consumer(queue, writer, operationContext));
        Thread consumerThread2 = new Thread(new Consumer(queue, writer, operationContext));
        Thread consumerThread3 = new Thread(new Consumer(queue, writer, operationContext));
        Thread supplierThread = new Thread(new Supplier(br, queue));

//        consumerThread1.setDaemon(true);
//        consumerThread2.setDaemon(true);
//        consumerThread3.setDaemon(true);

        supplierThread.start();

        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();

        supplierThread.join();
        //TODO come up with ending the consumer threads on time.
        writer.close();
    }
}
