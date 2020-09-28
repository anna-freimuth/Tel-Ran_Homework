public class HW15_2 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("А роза упала на лапу Азора")); //true
        System.out.println(checkPalindrome("поп"));  //true
        System.out.println(checkPalindrome("школа")); //false
    }

    private static boolean checkPalindrome(String str) {
        String input = makeLowerCaseNoSpaces(str);
        String strReverse = reverseString(input);
        return compareStrings(input, strReverse);
    }

    private static boolean compareStrings(String input, String strReverse) {
        for (int i = 0; i < input.length(); i++) {
            if (strReverse.charAt(i) != input.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static String reverseString(String input) {
        String strReverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            strReverse += input.charAt(i);
        }
        return strReverse;
    }

    private static String makeLowerCaseNoSpaces(String str) {
        String input = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                input += str.charAt(i);
            }
        }
        input = input.toLowerCase();
        return input;
    }
}
