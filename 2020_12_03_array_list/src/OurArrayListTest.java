import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {
    OurArrayList<String> list = new OurArrayList<>();

    @Test
    public void testSize_emptyList_zero() {
        assertEquals(0, list.size());
    }

    @Test
    public void testGet_emptyList_throwsIOOBE() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(10));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-10));
    }

    @Test
    public void testRemoveById_emptyList_throwsIOOBE() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeById(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeById(10));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeById(-10));
    }

    @Test
    public void testSet_emptyList_throwsIOOBE() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(0, "ab"));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(10, "bc"));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(-10, "cb"));
    }

    @Test
    public void testSizeAndAddLast_addSeveralElements_correctSize() {
        list.addLast("an");
        list.addLast("dy");
        list.addLast("cat");
        assertEquals(3, list.size());
    }

    @Test
    public void testGetAndAddLast_addSeveralElements_correctOrderOfElements() {
        String[] strings = {"cat", "dog", "bird", "2", "10", "water", "food", "word"};
        for (String string : strings) {
            list.addLast(string);
        }

        for (int i = 0; i < strings.length; i++) {
            assertEquals(strings[i], list.get(i));
        }
    }

    @Test
    public void testRemoveById_addSeveralElementsAndRemoveLast_correct() {
        String[] strings = {"cat", "dog", "bird", "2", "10", "water", "food", "word"};
        for (String string : strings) {
            list.addLast(string);
        }

        assertEquals("word", list.removeById(7));
        assertEquals(7, list.size());

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(7));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(7, "teo"));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeById(7));
    }

    @Test
    public void testRemoveById_addCapacityNumberElementsAndRemoveLast_correct() {

        for (int i = 0; i < 16; i++) {
            list.addLast("string" + i);
        }

        assertEquals("string15", list.removeById(15));
        assertEquals(15, list.size());

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(15));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(15, "random"));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeById(15));

    }

    @Test
    public void testRemoveById_addCapacityNumberElementsAndRemoveFirst_correct() {

        for (int i = 0; i < 16; i++) {
            list.addLast("String" + i);
        }

        assertEquals("String0", list.removeById(0));
        assertEquals(15, list.size());

        for (int i = 1; i < list.size(); i++) {
            assertEquals("String" + i, list.get(i - 1));
        }

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(15));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(15, "string"));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeById(15));
    }

    @Test
    public void testRemoveById_addCapacityNumberElementsAndRemoveIntermediate_correct() {

        for (int i = 0; i < 18; i++) {
            list.addLast("string" + i);
        }

        assertEquals("string5", list.removeById(5));
        assertEquals(17, list.size());

        for (int i = 0; i < 5; i++) {
            assertEquals("string" + i, list.get(i));
        }

        for (int i = 5; i < list.size(); i++) {
            assertEquals("string" + (i + 1), list.get(i));
        }

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(17));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(17, "string"));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeById(17));
    }


    @Test
    public void testAddLast_addInitialCapacityPlusOneElements_correctSizAndCapacity() {
        for (int i = 0; i < 17; i++) {
            list.addLast("string");
        }

        assertEquals(17, list.size());
        assertEquals(32, list.source.length);
    }

    @Test
    public void testSet_toFirstIndex() {

        addElementsToList(5);
        list.set(0, "home");

        assertEquals("home", list.get(0));
    }

    @Test
    public void testSet_toLastIndex() {

        addElementsToList(5);
        list.set(list.size() - 1, "sea");

        assertEquals("sea", list.get(list.size() - 1));
    }

    @Test
    public void set_To_Index_Between_First_And_Last() {

        int numberOfElements = 20;
        addElementsToList(numberOfElements);

        list.set(17, "sun");

        assertEquals("sun", list.get(17));
    }

    @Test
    public void testClear_emptyList() {
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testClear_nonEmptyList() {
        addElementsToList(20);

        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testUniversal_addSeveralElementsThenSetThenRemove_etc() {
        addElementsToList(4);

        list.removeById(2);
        list.set(1, "5");

        list.addLast("-10");
        list.addLast("-15");

        list.removeById(2);
        list.removeById(0);

        assertEquals(3, list.size());

        assertEquals("5", list.get(0));
        assertEquals("-10", list.get(1));
        assertEquals("-15", list.get(2));
    }

    private void addElementsToList(int number) {
        for (int j = 0; j < number; j++) {
            list.addLast("string" + j);
        }
    }
}
