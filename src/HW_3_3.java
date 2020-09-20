public class HW_3_3 {
    public static void main(String[] args) {
        System.out.println(euroConversion(1000)); //from Homework
        currencyConverter(1000,1.1); //from ClassWork
    }

    //from ClassWork
    private static void currencyConverter(double euro, double course) {
        System.out.println(euro * course + " amount of dollars you get for " + euro +" €");
    }

    //from Homework
    private static double euroConversion(double dollars) {
        double amountEuro = dollars / 1.1;
        return Math.round(amountEuro * 100) / 100.0;
    }
}


