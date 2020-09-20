public class HW_3_2 {
    public static void main(String[] args) {
        int r =5;
        findCircumference(r);
        findCircumference(7);
        findCircumference(10);
        int radiusFromKonstantin = 100;
        findCircumference(radiusFromKonstantin);
    }

    private static void findCircumference(int radius) {
        //L=2 PI*R
        double length = 2 * Math.PI * radius;
        System.out.println(length + "this is length of circum " + radius);
    }
}
