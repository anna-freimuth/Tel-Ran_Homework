package HW003;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayIntegerListTest {

    @Test
    public void testAddLast_addingElementsToArrayList_ArrayListCanHandleAddedElements() {

        ArrayIntegerList testList = new ArrayIntegerList();
        assertEquals(0, testList.size());

        testList.addLast(5);
        assertEquals(1, testList.size());
        assertEquals(5, testList.get(testList.size() - 1));

        testList.addLast(8);
        assertEquals(2, testList.size());
        assertEquals(8, testList.get(testList.size() - 1));
    }

    @Test
    public void testSet() {
        ArrayIntegerList testList = new ArrayIntegerList();
        testList.addLast(3);
        testList.addLast(5);
        testList.addLast(6);

        assertEquals(3, testList.get(0));
        testList.set(0, 1);
        // if I get the first element(index 0) from the array list
        // I expect it to be 1
        assertEquals(1, testList.get(0));

        assertEquals(5, testList.get(1)); // we check how it was before
        testList.set(1, 9); // we change it
        assertEquals(9, testList.get(1)); //here we check the change is really happened
    }

    @Test
    public void testRemoveById() {
        ArrayIntegerList testList = new ArrayIntegerList();
        testList.addLast(3);
        testList.addLast(5);
        testList.addLast(6);


        assertEquals(3, testList.size());
        int testValue = testList.removeById(1);
        assertEquals(5, testValue);
        assertEquals(2, testList.size());//the list size after remove
    }

    @Test
    public void testSize() {
        ArrayIntegerList testList = new ArrayIntegerList();
        testList.addLast(3);
        testList.addLast(5);
        testList.addLast(6);


        assertEquals(3, testList.size());
    }

    @Test
    public void testClear() {
        ArrayIntegerList testList = new ArrayIntegerList();
        testList.addLast(3);
        testList.addLast(5);
        testList.addLast(6);

        assertEquals(3, testList.size());
        testList.clear();
        assertEquals(0, testList.size());


    }

}
