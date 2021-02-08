public class IncrementingInteger {

   // private final Object incInt = new Object();

    private int source;   //private volatile int source;

    public IncrementingInteger(int source) {
        this.source = source;
    }

    public IncrementingInteger() {   //begins with 0
    }

    public synchronized void increment() {
        //  int temp = source + 1;
        // source = temp;
        // the same as -> source++;


       // synchronized (this){  //this -> object of IncrementingInteger  or use ->synchronized (incInt)
            source++;
       // }


//        synchronized (IncrementingInteger.class){ // this code will be unavailable for others if we once get in
//            source++;
//        }
    }

    public int get() {
        return source;
    }
}
