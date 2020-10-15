public class HW11 {
    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));  // Task 12. ->7
        System.out.println(sortaSum(9, 4));// Task 12.  ->20
        System.out.println(sortaSum(10, 11));// Task 12. ->21

        System.out.println(in1To10(5, false)); //Task 13.  ->true
        System.out.println(in1To10(11, false)); //Task 13.  ->false
        System.out.println(in1To10(11, true)); //Task 13.   ->true



        System.out.println(old35(3)); // Task 14. → true
        System.out.println(old35(10)); // Task 14.→ true
        System.out.println(old35(15));// Task 14. → false

    }

    private static boolean old35(int number) { //Task 14
        if (number % 3 == 0 && number % 5 == 0) return false;
        else if (number % 3 == 0 || number % 5 == 0) return true;
        else return false;
    }
    // private static boolean old35(int number) { //Task 14
    //return number % 5==0 ^ number % 3 ==0;
    //}

//    private static boolean in1To10(int n, boolean outsideMode) { // Task 13.
//        if (n <= 1 && outsideMode == true|| n >= 10 && outsideMode == true) return true;
//        if (n >= 1 && n <= 10 && outsideMode == false ) return true;
//        else return false;
//    }

    private static boolean in1To10(int n, boolean outsideMode) { // Task 13.
        if (n <= 1 && outsideMode || n >= 10 && outsideMode) return true;
        if (n >= 1 && n <= 10 ) return true;
        else return false;
    }

    private static int sortaSum(int a, int b) {// Task 12.
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }
}

