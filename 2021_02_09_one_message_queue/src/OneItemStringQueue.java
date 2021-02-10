public class OneItemStringQueue {

    private String source;

    public void addFirst(String item) {

        synchronized (this) {
            //wake
            source = item;
            this.notify();  //will make unfrozen only 1 thread(which first were frozen)
        }
    }

    public String removeLast() throws InterruptedException {
        synchronized (this) {           //will make thread that calls removeLast frozen
            while (source == null)
                //sleep
                this.wait();
        }
        String result = source;
        source = null;
        return result;
    }
}
