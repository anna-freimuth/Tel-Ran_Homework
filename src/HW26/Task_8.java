package HW26;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho")); //→ 1
        System.out.println(countHi("ABChi hi")); //→ 2
        System.out.println(countHi("hihi")); //→ 2
        System.out.println(countHi("hihih")); //→ 2
    }

    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }
}
