public class HW_3_4 {
    public static void main(String[] args) {
        //Belarus 207 600 km
        // Ukraine 603 628 km
        areaRatio(207595,603628); //from Homework
        //Moscow 2,511 km
        //891.8 km
        areaRatio(891, 2511); //from Homework
        rate(2511,891); // from Classwork
        rate(603628,207595); // from Classwork
    }

    private static void rate(double s1, double s2 ) { // from Classwork
        System.out.println(s1 / s2);
    }

    // from Homework
    private static void areaRatio(double area1, double area2) {
        double bigger_area = Math.max(area1, area2);
        double smaller_area = Math.min(area1, area2);
        double differenceAreaRate = Math.round((bigger_area / smaller_area) * 10) / 10.0;
        System.out.println(differenceAreaRate);

    }
}


