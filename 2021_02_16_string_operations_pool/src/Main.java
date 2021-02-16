import operation.OperationContext;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Main {
    final static String INPUT = "2021_02_11_string_operations/src/input.txt";
    final static String OUTPUT = "2021_02_11_string_operations/src/output.txt";
    final static String CONFIG_PROPS = "2021_02_11_string_operations/src/config.props";
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, InterruptedException {
        ConfigReader configReader = new ConfigReader(CONFIG_PROPS);
        OperationContext operationContext = new OperationContext(configReader.getOperationPaths());

        BufferedReader br = new BufferedReader(new FileReader(INPUT));
        PrintWriter writer = new PrintWriter(new FileOutputStream(OUTPUT));

        ExecutorService executorService = Executors.newFixedThreadPool(17);
        Supplier supplier = new Supplier(br,writer,executorService,operationContext);
        Thread supplierThread = new Thread(supplier);
        supplierThread.start();
        supplierThread.join();

        executorService.shutdown();// stops consuming tasks from the queue
        executorService.awaitTermination(10, TimeUnit.SECONDS);// waits for the tasks from the queue to be executed

        writer.close();

    }
}
