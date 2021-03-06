import java.util.ArrayList;
import java.util.List;

public class Main {
    static final int CREDIT = 20;

    public static void main(String[] args) throws InterruptedException {
        List<Thread> workers = new ArrayList<>();
        List<Speed> result = new ArrayList<>();
        long startingTime = System.currentTimeMillis();

        workers.add(new Thread(new Worker("Tanya", CREDIT, result, startingTime, 100, 200)));
        workers.add(new Thread(new Worker("Petya", CREDIT, result, startingTime, 200, 300)));
        workers.add(new Thread(new CreativeWorker("Vasya", CREDIT, result, startingTime,200,300)));

        for (Thread worker : workers)
            worker.start();

        for (Thread worker : workers)
            worker.join();

        for (Speed speed : result) {
            System.out.println(speed.getName() + " : " + speed.getSpeed());
        }
    }
}
