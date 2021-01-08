import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator<Auto> autosComparator = new AutosComparator();
        Auto opel = new Auto(2016, 10000);
        Auto mazda = new Auto(2019, 10000);
        Auto bmw = new Auto(1999, 0);
        Auto lada1 = new Auto(2020, 1000);
        Auto lada2 = new Auto(2020, 1000);

        List<Auto> autos = Arrays.asList(opel, mazda, bmw, lada1, lada2);
        autos.sort(autosComparator);
        System.out.println(autos.toString());
    }
}
