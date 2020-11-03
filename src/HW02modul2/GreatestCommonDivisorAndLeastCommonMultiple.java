package HW02modul2;

import java.util.Scanner;

public class GreatestCommonDivisorAndLeastCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        System.out.println("Please enter number1: ");
        number1 = input.nextInt();
        int number2;
        System.out.println("Please enter number1: ");
        number2 = input.nextInt();
        input.close();

        System.out.println("Greatest common divisor: " + findGreatestCommonDivisor(number1, number2));

        System.out.println("Least common multiple: " + findLeastCommonMultiple(number1, number2));
    }

    private static int findLeastCommonMultiple(int number1, int number2) {
        return Math.abs(number1 * number2) / findGreatestCommonDivisor(number1, number2);
    }

    private static int findGreatestCommonDivisor(int number1, int number2) {
        int minNumber = Math.min(number1, number2);
        int maxNumber = Math.max(number1, number2);
        if (maxNumber % minNumber == 0) return minNumber;
        return findGreatestCommonDivisor(minNumber, maxNumber % minNumber);
    }
}
