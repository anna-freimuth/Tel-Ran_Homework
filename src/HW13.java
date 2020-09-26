public class HW13 {
    public static void main(String[] args) {
        myGeneratorOfPassword(16);
    }

    private static void myGeneratorOfPassword(int lengthOfPassword) {
        String passwordSource = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@$%§?*'#~";
        for (int i = 0; i < lengthOfPassword; i++) {
            int chosenChar = (int) (Math.random() * 1000000) % passwordSource.length();
            System.out.print(passwordSource.charAt(chosenChar));
        }

    }
}
