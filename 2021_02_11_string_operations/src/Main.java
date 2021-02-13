import operation.OperationContext;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    final static String INPUT = "2021_02_11_string_operations/src/input.txt";
    final static String OUTPUT = "2021_02_11_string_operations/src/output.txt";
    final static String CONFIG_PROPS = "2021_02_11_string_operations/src/config.props";

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        ConfigReader configReader = new ConfigReader(CONFIG_PROPS);
        OperationContext operationContext = new OperationContext(configReader.getOperationPaths());

        BufferedReader br = new BufferedReader(new FileReader(INPUT));
        PrintWriter writer = new PrintWriter(new FileOutputStream(OUTPUT));
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();


        Thread consumerThread1 = new Thread(new Consumer(queue, writer, operationContext));
        Thread consumerThread2 = new Thread(new Consumer(queue, writer, operationContext));
        Thread consumerThread3 = new Thread(new Consumer(queue, writer, operationContext));
        Thread supplierThread = new Thread(new Supplier(br, queue));

        supplierThread.start();

        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();

        supplierThread.join();

        consumerThread1.interrupt();
        consumerThread2.interrupt();
        consumerThread3.interrupt();

        consumerThread1.join();
        consumerThread2.join();
        consumerThread3.join();

        writer.close();
    }
}
