public class Echo implements Runnable {

    private String message;

    @Override
    public void run() {
        while (true) { //if nobody touch the thread, this thread always sleeps

            //some complex logic lasting long time
            try {
                Thread.sleep(1000); //when begins to sleep, may be Interrupted Exception
            } catch (InterruptedException e) { //example how to manage thread from another thread
               // e.printStackTrace();
                System.out.println(message);
            }
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
