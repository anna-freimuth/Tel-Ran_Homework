import java.util.Comparator;

class Auto {
    int issueYear;
    int carMileage;

    public Auto(int issueYear, int carMileage) {
        this.issueYear = issueYear;
        this.carMileage = carMileage;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "carMileage=" + carMileage +
                ", issueYear=" + issueYear +
                '}';
    }
}

/**
 * The comparator determines a rule for comparing of two cars.
 * The rule is as follows: more valuable is a car which has less mileage,
 * and then it depends on an year of the issue.
 */
public class AutosComparator implements Comparator<Auto> {

    @Override
    public int compare(Auto a1, Auto a2) {
        if (a1.carMileage != a2.carMileage)
            return a2.carMileage - a1.carMileage;

        return a1.issueYear - a2.issueYear;
    }
}
