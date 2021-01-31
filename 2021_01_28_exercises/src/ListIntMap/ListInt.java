package ListIntMap;

import java.util.HashMap;

import java.util.Map;

public class ListInt {

    public Map<Integer, Integer> valueAsAmountOfRepeatingNumbers(Integer[] list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key : list) {
            if (map.containsKey(key)) {
                int value = map.get(key) + 1;
                map.put(key, value);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }
}
