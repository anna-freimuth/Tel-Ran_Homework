package HW26;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby")); //→ true
        System.out.println(xyBalance("aaxbb")); //→ false
        System.out.println(xyBalance("yaaxbb")); //→ false
        System.out.println(xyBalance("xayaxbb")); //→ false
    }

    private static boolean xyBalance(String str) {
        int x = str.lastIndexOf('x');
        int y = str.lastIndexOf('y');
        if (x == -1 || y == -1) return false;
        else return x < y;
    }
}
