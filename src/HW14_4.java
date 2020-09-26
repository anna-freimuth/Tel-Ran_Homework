public class HW14_4 {
    public static void main(String[] args) {
        multiplicationTable();

    }

    private static void multiplicationTable() {
        for (int i = 1; i <=10 ; i++) {
            newNumbers(i);
        }
    }

    private static void newNumbers(int newNumber) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%3d ", newNumber * i);
        }
        System.out.println();
    }
}
