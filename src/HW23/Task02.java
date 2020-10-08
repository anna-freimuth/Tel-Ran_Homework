package HW23;


public class Task02 {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread")); //→ "jam"
        System.out.println(getSandwich("xxbreadjambreadyy")); // → "jam"
        System.out.println(getSandwich("xxbreadbutterbreadyy")); // → "butter"

        System.out.println(getSandwich("xxbreadyy"));// → ""
    }

    private static String getSandwich(String str) {
        String search = "bread";
        if (!str.contains(search)) return "";
        str = str.substring(str.indexOf(search) + 5);
        if (!str.contains(search)) return "";
        return str.substring(0, str.indexOf(search));
    }
}
