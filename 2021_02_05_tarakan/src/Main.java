import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        long startingTime = System.currentTimeMillis();
        int distance = 10;
        List<Score> scoreList = new ArrayList<>();
        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Tarakan tarakan = new Tarakan("Tarakan" + i, distance, scoreList, startingTime);
            threadList.add(new Thread(tarakan));
        }

        for (Thread thread : threadList) {
            thread.start();
        }

        for (Thread thread : threadList) {
            thread.join();
        }

        for (Score score : scoreList) {
            System.out.println(score.getName() + ": " + score.getScore());
        }
    }
}
