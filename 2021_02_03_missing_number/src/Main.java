import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = missingNumberList();
        MissingNumber ms = new MissingNumber();
        System.out.println(ms.findMissingNumber(list));
    }

    private static List<Integer> missingNumberList() {
        Random random = new Random();
        int missingNumber = random.nextInt(100) + 1;
        System.out.println("Missing number is: " + missingNumber);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) if (i != missingNumber) list.add(i);
        Collections.shuffle(list);
        return list;
    }
}
