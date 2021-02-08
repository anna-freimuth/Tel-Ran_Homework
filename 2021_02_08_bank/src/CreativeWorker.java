import java.util.List;
import java.util.Random;

public class CreativeWorker implements Runnable {

    private final Random random = new Random();
    private String name;
    final private int credits;
    final List<Speed> speedList;
    private final long startingTime;
    private int count = 0;

    public CreativeWorker(String name, int credits, List<Speed> speedList, long startingTime) {
        this.name = name;
        this.credits = credits;
        this.speedList = speedList;
        this.startingTime = startingTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < credits; i++) {
            if (count > 0 || creative()) {
                int min = 50;
                int max = 100;
                int sleepPerCm = (random.nextInt((max - min) + 1) + min);
                count--;
                try {
                    Thread.sleep(sleepPerCm);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
                int min = 200;
                int max = 300;
                int sleepPerCm = (random.nextInt((max - min) + 1) + min);
                try {
                    Thread.sleep(sleepPerCm);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long speed = System.currentTimeMillis() - startingTime;
        speedList.add(new Speed(name, (int) speed));
    }

    private boolean creative() {
        if (random.nextInt(100) < 20) {
            count = 3;
            return true;
        };
        return false;
    }
}
