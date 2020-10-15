package HW27;

public class Task_14 {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy")); // → "++xy++"
        System.out.println(plusOut("12xy34", "1")); // → "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy")); // → "++xy++xy+++xy"
    }

    private static String plusOut(String stack, String needle) {
        String output = "";
        for (int i = 0; i < stack.length(); i++) {
            String rest = stack.substring(i);
            if (rest.startsWith(needle)) {
                output += needle;
                i += needle.length() - 1;
            } else {
                output += "+";
            }
        }
        return output;
    }
}

