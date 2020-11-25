package HW003;

public interface IntegerList {
    /**
     * Adds the element to the list object (to 'this' instance)
     *
     * @param element
     */

    void addLast(int element);

    /**
     * @param index - index of the element to return.It must be in range between 0 and (size-1).
     * @return returns the element by the index
     */

    int get(int index);

    /**
     * sets the value to the index place int the 'this' instance
     *
     * @param index the place to set
     * @param value the value to set
     */

    void set(int index, int value);

    /**
     * removes the element by the index
     *
     * @param index of the element to remove
     * @return value of the removed element
     */

    int removeById(int index);

    /**
     * @return the size of 'this
     */

    int size();

    /**
     * makes 'this' empty
     */

    void clear();

}
