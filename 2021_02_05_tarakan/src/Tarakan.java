import java.util.List;
import java.util.Random;

public class Tarakan implements Runnable {
    private final Random random = new Random();
    final private String name;
    final private int distance;  // has a speed of 1 every between 50 to 100 ms randomly
    final List<Score> scoreList;
    private final long startingTime;

    public Tarakan(String name, int distance, List<Score> scoreList, long startingTime) {
        this.name = name;
        this.distance = distance;
        this.scoreList = scoreList;
        this.startingTime = startingTime;
    }

    @Override
    public void run() {
        int sleepTotal = 0;
        for (int i = 0; i < distance; i++) {
            int min = 50;
            int max = 100;
            int sleepPerCm = (random.nextInt((max - min) + 1) + min);
            sleepTotal += sleepPerCm;
            try {
                Thread.sleep(sleepTotal);
            } catch (InterruptedException e) {
                return;
            }
        }

        long score = System.currentTimeMillis() - startingTime;
        scoreList.add(new Score(name, (int) score));
    }
}
