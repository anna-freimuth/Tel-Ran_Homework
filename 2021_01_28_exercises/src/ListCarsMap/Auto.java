package ListCarsMap;

import java.util.*;


public class Auto {

    String make;
    String color;

    public Auto(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public static Map<String, List<Auto>> groupByMake(List<Auto> autos) {
        Map<String, List<Auto>> map = new HashMap<>();

        for (Auto car : autos) {
            if (map.containsKey(car.make)) {
                List<Auto> list = map.get(car.make);
                list.add(car);
            } else {
                List<Auto> list = new ArrayList<>();
                list.add(car);
                map.put(car.make, list);
            }
        }
        return map;
    }
}
