public class HW9_4 {
    public static void main(String[] args) {
        numbersFibonacci();

    }

    private static void numbersFibonacci(){
        System.out.print("1 1 ");
        int earlier = 1;
        int later = 1;
        for (int i = 3; i <= 11; i++) { // do the loop 9 times, because 11-3 = 8 , but we count as 12-3= 9 because 11 included
            int newNumber = earlier + later;
            System.out.print(newNumber + " ");
            earlier = later;
            later = newNumber;
        }
    }
}

