public class HW10 {
    public static void main(String[] args) {
        evenNumbers(2, 17);  // Task 1. finding even numbers between a and b
        oddNumbers(3, 19);   // Task 2. finding odd numbers between a and b
        multiplicityNumbers(11, 121);    //  Task 3. finding multiplicity numbers (11) between a and b
        yearLeap(2020); //  Task 4.Leap year or no
        yearLeap(2021); // Task 4. Leap year or no
    }

    private static void yearLeap(int year) { //Task 4. Leap year or no
        if (year % 4 == 0 ) {
            System.out.println("This year is a leap year: " + year);
        } else {
            System.out.println("This year is not a leap year: " + year);
        }
    }

    private static void multiplicityNumbers(int a, int b) { //Task 3. finding multiplicity numbers (11) between a and b
        int lower = Math.min(a, b);
        int higher = Math.max(a, b);
        for (int i = lower; i <= higher; i++) {
            if (i % 11 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void oddNumbers(int a, int b) { // Task 2. finding odd numbers between a and b
        int lower = Math.min(a, b);
        int higher = Math.max(a, b);
        for (int i = lower; i <= higher; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void evenNumbers(int a, int b) { // Task 1. finding even numbers between a and b

        int lower = Math.min(a, b);
        int higher = Math.max(a, b);
        for (int i = lower; i <= higher; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
