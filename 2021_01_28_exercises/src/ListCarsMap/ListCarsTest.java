package ListCarsMap;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ListCarsTest {

    Auto mazda1 = new Auto("Mazda", "Green");
    Auto mazda2 = new Auto("Mazda", "Yellow");
    Auto mazda3 = new Auto("Mazda", "Blue");
    Auto mazda4 = new Auto("Mazda", "Gray");
    List<Auto> mazdas = Arrays.asList(mazda1, mazda2, mazda3, mazda4);
    Auto opel1 = new Auto("Opel", "Green");
    Auto opel2 = new Auto("Opel", "Yellow");
    Auto opel3 = new Auto("Opel", "Blue");
    List<Auto> opels = Arrays.asList(opel1, opel2, opel3);
    Auto bmw1 = new Auto("BMW", "Gray");
    List<Auto> bmws = Arrays.asList(bmw1);

    List<Auto> autos = Arrays.asList(mazda1, mazda2, mazda3, mazda4, opel1, opel2, opel3, bmw1);

    @Test
    public void groupByMake() {

        Map<String, List<Auto>> map = Auto.groupByMake(autos);

        // check mazdas
        List<Auto> list = map.get(mazda1.make);
        for (Auto mazda : mazdas) {
            assertTrue(list.contains(mazda));
        }
        assertEquals(4, list.size());

        // check opels
        list = map.get(opel3.make);
        for (Auto opel : opels) {
            assertTrue(list.contains(opel));
        }
        assertEquals(3, list.size());

        // check bmws
        list = map.get(bmw1.make);
        for (Auto bmw : bmws) {
            assertTrue(list.contains(bmw));
        }
        assertEquals(1, list.size());

        assertEquals(3, map.size());
    }
}
