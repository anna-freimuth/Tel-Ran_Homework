public class HW14_5 {
    public static void main(String[] args) {
        triangle(10);
        triangleIsosceles(10);
        triangleInverted(10);
    }

    private static void triangleInverted(int lines) {
        for (int line = lines; line >= 1; line--) {

            for (int star = line; star >= 1; star--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    private static void triangleIsosceles(int lines) {
        for (int line = 1; line <= lines; line++) {

            for (int space = 0; space < lines - line; space++) {
                System.out.print(" ");
            }
            for (int star = lines -line; star < lines; star++) {
                System.out.print("**");
            }
            System.out.println();
        }
    }


    private static void triangle(int lines) {
        String star = "*";
        String line = "";
        for (int i = 0; i < lines; i++) {
            line = line + star;
            System.out.println(line);
        }
    }
}
