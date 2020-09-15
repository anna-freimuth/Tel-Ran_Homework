public class HW7 {

    public static void main(String[] args) {
        test();
    }

    public static boolean love6(int a, int b) {
        return a == 6 ||
                b == 6 ||
                a + b == 6 ||
                Math.abs(a - b) == 6;
    }

    private static void test() {
        System.out.println(love6(6, 4));
        System.out.println(love6(4, 5));
        System.out.println(love6(1, 5));
        System.out.println(love6(14, 20));
        System.out.println(love6(20, 14));
    }
}
