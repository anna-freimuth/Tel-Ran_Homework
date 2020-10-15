public class HW10_7 {
    public static void main(String[] args) {
        System.out.println(yearLeap(1900)); //false
        System.out.println(yearLeap(2020));  // true
        System.out.println(yearLeap(2000));  // true
        System.out.println(yearLeap(2019)); //false
    }

    private static boolean yearLeap(int year) { //Task 7 Leap year or no
        if (year % 4 == 0 && year % 100 != 0) return true;
        else if (year % 400 == 0) return true;
        else return false;

    }
    //private static boolean yearLeap(int year) {
    //return (year % 400 == 0|(year % 4 == 0 ^year % 100 ==0);
    // }
}
