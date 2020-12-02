public class Main {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[]{
                new Line('#', 10),
                new Rectangle('+', 5, 8)
        };
        Picture picture = new Picture('~', shapes);
        picture.draw();
    }
}
