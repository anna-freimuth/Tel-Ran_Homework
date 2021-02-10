public class MessageConsumer implements Runnable {

    OneItemStringQueue queue;   //capacity 1

    public MessageConsumer(OneItemStringQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                System.out.println(queue.removeLast());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
