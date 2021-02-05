public class CharThreadRunnable implements Runnable{
    int times;
    final char ch;

    public CharThreadRunnable(int times, char ch){
        this.times = times;
        this.ch = ch;
    }

    @Override
    public void run() {
        System.out.println("Start CharThread");
        for (int i = 0; i < times; i++) {
            System.out.println(ch);
        }

}
}
