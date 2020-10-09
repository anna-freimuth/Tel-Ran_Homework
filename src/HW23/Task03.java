package HW23;

public class Task03 {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap")); // → "zpXzp"
        System.out.println(zipZap("zopzop")); // → "zpzp"
        System.out.println(zipZap("zzzopzop")); // → "zzzpzp"
    }

    private static String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }
}
