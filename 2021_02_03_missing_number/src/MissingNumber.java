import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

    public int findMissingNumber(List<Integer> shuffledList) {

        List<Integer> list = new ArrayList<>(shuffledList);
        list.add(0);
        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            int currentNumber = list.get(i);
            int nextNumber = list.get(i + 1);
            if (currentNumber + 1 != nextNumber) {
                return currentNumber + 1;
            }
        }
        return -1;
    }
}
