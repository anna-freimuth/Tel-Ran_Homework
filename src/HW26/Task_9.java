package HW26;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc")); // → true
        System.out.println(endOther("AbC", "HiaBc")); //→ true
        System.out.println(endOther("abc", "abXabc"));// → true
        System.out.println(endOther("abcZ", "abXabc"));// → false
    }

    private static boolean endOther(String str1, String str2) {
        return str2.toLowerCase().endsWith(str1.toLowerCase())
                || str1.toLowerCase().endsWith(str2.toLowerCase());
    }
}
