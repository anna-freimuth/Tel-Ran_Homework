public class HW6_8 {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
        System.out.println(lastChars("", ""));

    }

    private static String lastChars(String a, String b) {
        if (a.length()==0 && b.length()==0){
            return "@" + "@";
        } else if (b.length() == 0) {
            return a.substring(0, 1) + "@";
        } else if (a.length() == 0) {
            return "@" + b.substring(b.length()-1);
        } else {
            return a.substring(0, 1) + b.substring(b.length() -1);
        }
    }
}

