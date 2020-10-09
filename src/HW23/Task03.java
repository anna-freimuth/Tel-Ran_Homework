package HW23;

public class Task03 {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap")); // → "zpXzp"
        System.out.println(zipZap("zopzop")); // → "zpzp"
        System.out.println(zipZap("zzzopzop")); // → "zzzpzp"
        System.out.println(zipZap2("zipXzap")); // → "zpXzp"
        System.out.println(zipZap2("zopzop")); // → "zpzp"
        System.out.println(zipZap2("zzzopzop")); // → "zzzpzp"
    }

    private static String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }

    private static String zipZap2(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && str.length() - 2 > i && str.charAt(i + 2) == 'p') {

                str = str.substring(0, i + 1) + str.substring(i + 2);
            }
        }
        return str;
    }
}
