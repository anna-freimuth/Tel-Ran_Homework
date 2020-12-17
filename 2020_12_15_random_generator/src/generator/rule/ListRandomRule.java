package generator.rule;

import generator.RandomRule;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListRandomRule implements RandomRule {

    private int[] values;

    Random random = new Random();

    public ListRandomRule(int[] numbers) {

        this.values = Arrays.copyOf(numbers, numbers.length);
    }

    public ListRandomRule(List<Integer> list) {

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        values = array;
    }

    @Override
    public int nextInt() {

        return values[random.nextInt(values.length)];
    }
}
