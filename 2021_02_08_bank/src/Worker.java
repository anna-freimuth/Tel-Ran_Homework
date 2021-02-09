import java.util.List;
import java.util.Random;

public class Worker implements Runnable {

    private final Random random = new Random();
    final private String name;
    final private int credits;
    final List<Speed> speedList;
    private final long startingTime;
    private final int min;
    private final int max;

    public Worker(String name, int credits, List<Speed> speedList, long startingTime, int min, int max) {
        this.name = name;
        this.credits = credits;
        this.speedList = speedList;
        this.startingTime = startingTime;
        this.min = min;
        this.max = max;
    }


    @Override
    public void run() {
        for (int i = 0; i < credits; i++) {
            int sleepPerCm = (random.nextInt((max - min) + 1) + min);
            try {
                Thread.sleep(sleepPerCm);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        long speed = System.currentTimeMillis() - startingTime;
        Speed result = new Speed(name, (int) speed);

        synchronized (speedList) {
            speedList.add(result);
        }
    }
}
