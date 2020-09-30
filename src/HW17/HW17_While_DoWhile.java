package HW17;

public class HW17_While_DoWhile {
    public static void main(String[] args) {
        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        numberATimesB(3, 5);

        //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        ascendingOrder(5, 17);

    }

    private static void ascendingOrder(int a, int b) {
        int number = a;
        do {
            number++;
            System.out.print(" " + number);
        } while (number < b - 1);

    }

    private static void numberATimesB(int a, int b) {
        int count = 0;
        while (count < b) {
            System.out.print(" " + a);
            count++;
        }
        System.out.println();
    }
}

