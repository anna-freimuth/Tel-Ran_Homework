import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackMaxTest {

    StackMax list = new StackMax();

    @Test
    void addLast() {
        list.addLast(5);
        list.addLast(8);
        list.addLast(15);

        assertEquals(3, list.size());
        assertEquals(15, list.getLast());
    }

    @Test
    void getLast() {
        list.addLast(5);
        list.addLast(8);
        list.removeLast();

        assertEquals(1, list.size());
        assertEquals(5, list.getLast());
    }

    @Test
    void getLastEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> {
            list.getLast();
        });
    }

    @Test
    void removeLast() {
        list.addLast(5);
        list.addLast(3);
        list.addLast(15);
        list.removeLast();
        list.addLast(8);
        list.removeLast();

        assertEquals(2, list.size());
        assertEquals(3, list.getLast());
    }

    @Test
    void removeLastEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> {
            list.removeLast();
        });
    }

    @Test
    void size() {
        list.addLast(5);
        list.addLast(3);
        list.addLast(15);
        list.removeLast();
        list.addLast(8);

        assertEquals(3, list.size());
    }

    @Test
    void getMax_withOneNumber() {
        list.addLast(10);

        assertEquals(10, list.getMax());
    }

    @Test
    void getMax_addSeveralNumbers_and_removeLast() {
        list.addLast(-5);
        list.addLast(-3);
        list.addLast(-15);
        list.addLast(-5);
        list.removeLast();

        assertEquals(-3, list.getMax());
    }

    @Test
    void getMaxEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> {
            list.getMax();
        });
    }
}
