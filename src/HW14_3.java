public class HW14_3 {
    public static void main(String[] args) {
         chessBoard(7);
    }

    private static void chessBoard(int lines) {
        for (int i = 0; i < lines ; i++) {
            amountOfCharacters(lines, i % 2);
        }
    }

    private static void amountOfCharacters(int numberOfCharacters, int startStar) {
        for (int i = 1; i <= numberOfCharacters; i++) {

            if (i % 2 == startStar){
                System.out.print("-");
            }else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
