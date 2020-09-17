public class HW9_2 {
    public static void main(String[] args) {
        System.out.println(mySum(5,6,5));
        System.out.println(mySum(5,6,7));
        System.out.println(mySum(0,0,0));
        System.out.println(mySum(0,-5,5));
    }

    private static int mySum(int a, int b, int c) {
        if (a == c) {
            return b;
        } else if (a + b + c == 0) {
            return -1;
        } else{
            return a+b+c;
        }

    }

}
