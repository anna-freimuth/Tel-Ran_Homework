public class HW_02 {
    public static void main(String[] args) {
        int squareSide =15;
        squareSquare(squareSide);
        perimetrSquare(squareSide);
        perimetrRectangle(4,5);
        squareRectangle(4,5);
        perimetrCube(2);
        squareCube(2);



    }

    private static void squareCube(int a) {
        System.out.println("Square of cube: " + 6 * a * a);
    }

    private static void perimetrCube(int a) {
        System.out.println("Perimetr cube: "+ a*12);
    }

    private static void squareRectangle(int a,int b) {
        System.out.println("Square of rectangle: " + a*b);
    }

    private static void perimetrRectangle(int a, int b) {
        int sum = a + b;
        System.out.println("Perimetr of rectangle: " + sum*2) ;

    }

    public static void squareSquare(int a){
        System.out.println("Squere of square: "+ a * a);
    }
    public static void perimetrSquare(int a){
        System.out.println("Perimetr of square: "+ 4 * a);
    }
}
