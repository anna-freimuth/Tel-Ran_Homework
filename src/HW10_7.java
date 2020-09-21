public class HW10_7 {
    public static void main(String[] args) {
        yearLeap(2020);
        yearLeap(2021);
        yearLeap(2000);
    }

    private static void yearLeap(int year) { //Task 7 Leap year or no
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("This year is a leap year: " + year);
        } else if (year % 400 == 0) {
            System.out.println("This year is a leap year: " + year);
        }else {
            System.out.println("This year is not a leap year: " + year);
        }
    }
}
