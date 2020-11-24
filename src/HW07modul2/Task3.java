package HW07modul2;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(5)));
    }

    private static int[] seriesUp(int n) {
        int[] output = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                output[index++] = j;
            }
        }
        return output;
    }
}
