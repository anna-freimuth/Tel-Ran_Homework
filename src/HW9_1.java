public class HW9_1 {
    public static void main(String[] args) {
        System.out.println(moreOrLess(5, 6));
        System.out.println(moreOrLess(5, 5));
        System.out.println(moreOrLess(0, 100));
    }

    private static int moreOrLess(int a, int b) {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return 0;
        }

    }
}
