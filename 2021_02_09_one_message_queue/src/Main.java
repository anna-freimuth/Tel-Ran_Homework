public class Main {
    public static void main(String[] args) {

        OneItemStringQueue queue = new OneItemStringQueue();

        Thread consumerThread1 = new Thread(new MessageConsumer(queue));
        Thread consumerThread2 = new Thread(new MessageConsumer(queue));
        Thread supplierThread = new Thread(new MessageSupplier(queue));

        consumerThread1.setDaemon(true);
        consumerThread2.setDaemon(true);

        consumerThread1.start();
        consumerThread2.start();
        supplierThread.start();
    }
}
