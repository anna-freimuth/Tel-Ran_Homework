import java.util.Arrays;

public class ConcatenationTester {

    private final IConcatenator concatenator;

    public ConcatenationTester(IConcatenator concatenator) {
        this.concatenator = concatenator;
    }

    public void test(int times, String text) {

        String[] array = composeArray(times, text);

        long beforeConcatenation = System.currentTimeMillis();
        concatenator.concatenate(array);
        long timeConcatenated = System.currentTimeMillis() - beforeConcatenation;

        System.out.println(timeConcatenated);
    }

    private String[] composeArray(int times, String text) {

        String[] arr = new String[times];
        //Arrays.fill(arr,text);

        for (int i = 0; i < times; i++) {
            arr[i] = text;
        }

        return arr;
    }
}
