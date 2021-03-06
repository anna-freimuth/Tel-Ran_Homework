public class CharThreadRunnable implements Runnable {
    int times;
    final char ch;

    public CharThreadRunnable(int times, char ch) {
        this.times = times;
        this.ch = ch;
    }

    @Override
    public void run() {
        System.out.println("Start CharThread Runnable");
        for (int i = 0; i < times; i++) {
            System.out.println(ch);

           // Thread.yield();      instead Thread.sleep
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
              break;
            }
        }
    }
}
