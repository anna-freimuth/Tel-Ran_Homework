import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Map<Auto, String> map = new HashMap<>();
        fillMap(map);


        Auto anotherGreyOpel = new Auto("Opel", "Grey");
        String value = map.get(anotherGreyOpel);
        System.out.println(value);

    }

    static void fillMap(Map<Auto, String> map) {
        Auto greyOpel = new Auto("Opel", "Grey");
        map.put(greyOpel, "Value of grey opel");
    }
}

class Auto {
    private final String make;

    private final String color;


    public Auto(String make, String color) {
        this.make = make;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(make, auto.make) &&
                Objects.equals(color, auto.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, color);
    }
}
