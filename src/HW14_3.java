public class HW14_3 {
    public static void main(String[] args) {
         chessBoard(8);
    }

    private static void chessBoard(int lines) {
        String star = "*";
        String dash = "-";
        String myLine = "";
        String anotherLine = "";
        for (int i = 0; i < lines ; i++) {
            myLine = (star + dash);
            anotherLine = ( dash + star);
            if (i % 2 == 0) {
                System.out.println(myLine + myLine + myLine + myLine);
            } else {
                System.out.println(anotherLine + anotherLine + anotherLine + anotherLine);
            }
        }
    }


}
