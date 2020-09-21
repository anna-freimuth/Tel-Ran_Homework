public class HW10_7 {
    public static void main(String[] args) {
        System.out.println(yearLeap(2020));
        System.out.println(yearLeap(2021));
        System.out.println(yearLeap(2000));
    }

    private static boolean yearLeap(int year) { //Task 7 Leap year or no
        if (year % 4 == 0 && year % 100 != 0) return true;
        else if (year % 400 == 0)  return true;
        else return false;

    }
}
