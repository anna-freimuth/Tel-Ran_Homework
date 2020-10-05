package HW20;

public class HW20 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The biggest number is: " + max);
        System.out.println("The smallest number is: " + min);
        System.out.println("Middle: " + (sum / arr.length));
        System.out.println("Sum: " + sum);
    }
}
