public class Point2D {

    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return angle of the point from [0; 2*pi)
     */
    public double getAngleRads() {
        double result = Math.atan2(y, x);
        return result < 0 ? result + 2 * Math.PI : result;
    }
}

