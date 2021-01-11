
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public interface OurList<Type> extends Iterable<Type> {
    /**
     * Adds the element to the 'this' instance
     *
     * @param element - to add
     */
    void addLast(Type element);

    /**
     * @param index - index of the element to return. It must be in the range between 0 and (size-1).
     * @return returns the element by the index
     */
    Type get(int index);

    /**
     * sets the value to the index place in the 'this' instance
     *
     * @param index the place to set
     * @param value the value to set
     */
    void set(int index, Type value);

    /**
     * removes the element by the index
     *
     * @param index the index of the element to remove
     * @return the value of the removed element
     */
    Type removeById(int index);

    /**
     * @return the size of 'this'
     */
    int size();

    /**
     * makes 'this' empty
     */
    void clear();

    /**
     * removes the obj if there is an element in the list which 'equals' to the obj. The method
     * must remove only first such element.
     *
     * @param obj to remove
     * @return true if the object was found and removed, false otherwise
     */
    boolean remove(Type obj);

    /**
     * @param obj to check
     * @return true if the obj is present in this list (according to the method 'equals')
     */
    boolean contains(Type obj);

    /**
     * @return iterator object which iterates from the beginning to the end of the list
     */
    Iterator<Type> forwardIterator();

    /**
     * @return iterator object which iterates from the end to the beginning of the list
     */
    Iterator<Type> backwardIterator();

    /**
     * sorts the list according to the 'comparator' rule
     *
     * @param comparator the rule to sort the list
     */

    default void sort(Comparator<Type> comparator) {
        Object[] copy = new Object[size()];

        int i = 0;
        for (Type element : this) {
            copy[i++] = element;
        }//copy: {15, -8, 3}
        //  Arrays.sort(copy, comparator);
        for (int j = 0; j < copy.length - 1; j++) {
            if (comparator.compare((Type) copy[j], (Type) copy[j + 1]) <= 0) {
                continue;
            }
            Type temp = (Type) copy[j];
            copy[j] = copy[j + 1];
            copy[j + 1] = temp;
            j = -1;
        }
        // copy:{-8, 3, 15}
        this.clear();
        for (Object element : copy) {
            this.addLast((Type) element);
        }
    }

    default void sort() {
        Type[] copy = (Type[]) new Object[size()];

        int i = 0;
        for (Type element : this) {
            copy[i++] = element;
        }

        for (int j = 0; j < copy.length - 1; j++) {
            Comparable<Type> compCurrentElement = (Comparable<Type>) copy[j];
            Type compNextElement = copy[j + 1];
            if (compCurrentElement.compareTo(compNextElement) <= 0)
                continue;
            Type temp = copy[j];
            copy[j] = copy[j + 1];
            copy[j + 1] = temp;
            j = -1;
        }
        this.clear();
        for (Type element : copy) {
            this.addLast(element);
        }
    }


    /**
     * The method uses the natural ordering inside the list.
     * Meaning the elements must be comparable
     *
     * @return max according to the natural ordering
     */
    default Type getMax() {
        if (size() == 0)
            throw new EmptyListException();

        Type max = this.get(0);
        for (Type currentElement : this) {
            Comparable<Type> compCurrentElement = (Comparable<Type>) currentElement;
            if (compCurrentElement.compareTo(max) > 0)
                max = currentElement;
        }
        return max;
    }

    default Type getMax(Comparator<Type> comparator) {
        if (size() == 0)
            throw new EmptyListException();

        Type max = this.get(0);
        for (Type currentElement : this) {
            if (comparator.compare(currentElement, max) > 0)
                max = currentElement;
        }

        //OR
//        Iterator<Type> iterator = iterator();
//        Type max = iterator.next();
//
//        while (iterator.hasNext()) {
//            Type currentElement = iterator.next();
//            if (comparator.compare(currentElement, max) > 0)
//                max = currentElement;
//        }

        //OR
//        Type max = (Type) source[0];
//        for (int i = 1; i < size; i++) {
//            Type temp = (Type) source[i];
//            if (comparator.compare(temp, max) > 0)
//                max = temp;
//        }
        return max;
    }


    default Type getMin() {
//        if (size() == 0)
//            throw new EmptyListException();

//        Type min = this.get(0);
//        for (Type currentElement : this) {
//            Comparable<Type> compCurrentElement = (Comparable<Type>) currentElement;
//            if (compCurrentElement.compareTo(min) < 0)
//                min = currentElement;
//        }
//        return min;

        //OR
        // Iterator <Type> iterator = iterator();
       // Type first = iterator.next();
        Comparator<Type> comparator = new Comparator<Type>() {
            @Override
            public int compare(Type o1, Type o2) {
                Comparable<Type> comparableO1 =(Comparable<Type>)  o1;
                return comparableO1.compareTo(o2);
            }
        };
        return getMin(comparator);
    }


    default Type getMin(Comparator<Type> comparator) {

        return getMax(comparator.reversed());

        //OR

//        if (size == 0)
//            throw new EmptyListException();
//
//        Type min = (Type) source[0];
//        for (int i = 1; i < size; i++) {
//            Type temp = (Type) source[i];
//            if (comparator.compare(temp, min) < 0)
//                min = temp;
//        }
//        return min;
    }
}
