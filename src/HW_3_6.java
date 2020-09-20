public class HW_3_6 {
    public static void main(String[] args) {
        //MyLovelyBank
        bankAccount(1000,7,3.5);

    }

    private static void bankAccount(double money, int year, double interest) {
        double result = interest * year * money / 100 + money;
        System.out.println("Sum in the and of contract " + result);
    }
}
