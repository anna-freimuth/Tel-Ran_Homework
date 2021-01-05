import org.junit.jupiter.api.Test;


import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;


class OurFixedArrayDequeTest {
    OurFixedArrayDeque<Integer> listDeque = new OurFixedArrayDeque<>(10);


    private void addElementsToList(int capacity) {
        for (int j = 0; j < capacity; j++) {
            listDeque.addLast(1 + j);
        }
    }

    @Test
    void addFirst() {
        addElementsToList(1);
        listDeque.addFirst(5);

        assertEquals(2, listDeque.size());
    }

    @Test
    void addFirstDequeOverflowException() {
        addElementsToList(10);
        assertThrows(DequeOverflowException.class, () -> {
            listDeque.addFirst(3);
        });
    }


    @Test
    void getFirst() {
        addElementsToList(3);
        listDeque.addFirst(6);

        assertEquals(6, listDeque.getFirst());
    }

    @Test
    void getFirstEmptyDequeException() {
        assertThrows(EmptyDequeException.class, () -> {
            listDeque.getFirst();
        });
    }

    @Test
    void removeFirst() {
        listDeque.addFirst(6);
        listDeque.addFirst(5);

        assertEquals(5, listDeque.removeFirst());
        assertEquals(6, listDeque.getFirst());
    }

    @Test
    void removeFirstEmptyDequeException() {
        assertThrows(EmptyDequeException.class, () -> {
            listDeque.removeFirst();
        });
    }

    @Test
    void addLast() {
        addElementsToList(5);
        listDeque.addLast(8);

        assertEquals(6, listDeque.size());
    }

    @Test
    void addLastDequeOverflowException() {
        addElementsToList(10);
        assertThrows(DequeOverflowException.class, () -> {
            listDeque.addLast(3);
        });
    }

    @Test
    void getLast() {
        addElementsToList(5);
        listDeque.addLast(8);

        assertEquals(8, listDeque.getLast());
    }

    @Test
    void removeLast() {
        listDeque.addFirst(6);
        listDeque.addFirst(3);

        assertEquals(2, listDeque.size());
        assertEquals(6, listDeque.removeLast());
        assertEquals(1, listDeque.size());
    }

    @Test
    void removeLastEmptyDequeException() {
        assertThrows(EmptyDequeException.class, () -> {
            listDeque.removeLast();
        });
    }

    @Test
    void size_checkIfZeroEmptyList() {
        assertEquals(0, listDeque.size());
    }

    @Test
    void size() {
        addElementsToList(8);
        assertEquals(8, listDeque.size());
    }


    @Test
    public void testBackwardIterator(){

        int[] array = {10, -8, 0, 15};
        OurFixedArrayDeque<Integer> secondList = new OurFixedArrayDeque<>(10);
        for (int num : array) {
            listDeque.addLast(num);
            secondList.addLast(num);
        }

        Iterator<Integer> iterator = listDeque.backwardIterator();

        while (iterator.hasNext()) {
            assertEquals(secondList.removeLast(), iterator.next());
        }
    }

    @Test
    public void testIterable() {

        int[] array = {10, -8, 0, 15};
        OurFixedArrayDeque<Integer> secondList = new OurFixedArrayDeque<>(10);
        for (int num : array) {
           listDeque.addLast(num);
           secondList.addLast(num);
        }

        for (int currentIntegerToCheck: listDeque) {
            assertEquals(secondList.removeFirst(), currentIntegerToCheck);
        }
    }



    @Test
    void getMax() {
        listDeque.addFirst(-22);
        listDeque.addFirst(-3);
        listDeque.addFirst(-9);

        assertEquals(-3, listDeque.getMax());
    }
}

