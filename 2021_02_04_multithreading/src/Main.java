public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start main thread");

        CharThread starThread = new CharThread(20, '*');
        CharThread plusThread = new CharThread(20, '+');

        starThread.start();
        plusThread.start();

        starThread.join(); //thread main is waiting until starThread and plusThread will be done
        plusThread.join();

        System.out.println("End of main thread");



        CharThreadRunnable charThreadRunnable = new CharThreadRunnable(10,'@');
        CharThreadRunnable charThreadRunnable2 = new CharThreadRunnable(10,'#');

        Thread thread = new Thread(charThreadRunnable);
        Thread thread2 = new Thread(charThreadRunnable2);

        thread.start();
        thread2.start();
    }
}
