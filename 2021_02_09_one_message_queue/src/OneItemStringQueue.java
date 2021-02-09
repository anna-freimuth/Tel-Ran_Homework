public class OneItemStringQueue {

    private final Object mutex = new Object();
    private String source;

    public void addFirst(String item) {
        source = item;

        //wake
        mutex.notify();  //will make unfrozen only 1 thread(which first were frozen)
    }

    public String removeLast() throws InterruptedException {
        synchronized (mutex) {           //will make thread that calls removeLast frozen
            while (source == null)
                //sleep
                mutex.wait();
        }
        String result = source;
        source = null;
        return  result;
    }
}
