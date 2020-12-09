import java.util.*;

public class Solution {

 /*   public boolean solve(List<Integer> numbers, int n) {   // O(n)
        // Deque<Integer> deque = new LinkedList<>(numbers);
        Deque<Integer> deque = new ArrayDeque<>(numbers);

        while (deque.size() >= 2) {
            int multiplication = deque.getFirst() * deque.getLast(); //constant amount O(1)
            if (multiplication > n) {
                deque.removeLast();
            } else if (multiplication < n) {
                deque.removeFirst();
            } else {
                return true;
            }
        }
        return false;
    }*/

    public boolean solve(List<Integer> numbers, int n) {  // O(n^2)        n is equal to size
        ArrayList<Integer> list = new ArrayList<>(numbers);  // O(n)
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = list.get(i);
            for (int j = i + 1; j < size; j++) {
                int b = list.get(j);
                if (a * b == n)
                    return true;
            }
        }
        return false;
    }
}
