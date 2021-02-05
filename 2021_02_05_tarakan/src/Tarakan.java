import java.util.List;

public class Tarakan implements Runnable {

    final private String name;
    final private int distance;  //1cm  runs between 50 and 100 mc randomly
    final List<Score> scoreList;
    private long startingTime;

    public Tarakan(String name, int distance, List<Score> scoreList, long startingTime) {
        this.name = name;
        this.distance = distance;
        this.scoreList = scoreList;
        this.startingTime = startingTime;
    }

    @Override
    public void run() {
        //TODO the tarakan runs here

        //TODO after the tarakan comes to the finish, it signs up itself into the scoreList
    }
}
