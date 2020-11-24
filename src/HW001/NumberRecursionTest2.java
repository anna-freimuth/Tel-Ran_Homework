package HW001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberRecursionTest2 {

    NumberRecursion solver = new NumberRecursion();

    @Test
    public void testRecursion_nEquals1_1() {
        assertEquals(1, solver.numberRecursion(1));
    }

    @Test
    public void testRecursion_nEquals10_100() {
        assertEquals(100, solver.numberRecursion(10));
    }

    @Test
    public void testRecursion_nEquals13_169() {
        assertEquals(169, solver.numberRecursion(13));
    }
}