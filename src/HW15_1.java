public class HW15_1 {
    public static void main(String[] args) {
        /* a and b are positive numbers (1-99) */
        printSumInRub(1, 5);
        printSumInRub(80, 99);
    }

    private static void printSumInRub(int a, int b) {

        for (int i = a; i <= b; i++) {
            System.out.println(i + " " + rightWordInRussian(i));

        }
    }

    private static String rightWordInRussian(int number) {
        String output;

        int lastTwoDigits = number % 100; // 0 - 99 range of last two digits
        int lastDigit = lastTwoDigits % 10; // 0 - 9 range of last digit
        if (
                (lastTwoDigits >= 11 && lastTwoDigits <= 20) ||
                lastDigit == 0 ||
                lastDigit >= 5
        ) {
            output = "рублей";
        } else if (lastDigit == 1) {
            output = "рубль";
        } else {
            output = "рубля";
        }
        return output;
    }
}


