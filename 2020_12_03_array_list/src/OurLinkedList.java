import java.util.Iterator;

public class OurLinkedList<T> implements OurList<T> {

    Node<T> first; // null
    Node<T> last;  // null
    int size;   // 0

    @Override
    public void addLast(T element) {

        Node<T> node = new Node<>(null, last, element);
        //Node<T> node = new Node<>(null, null, element);
        if (size == 0) {
            first = last = node;    // when we add the first element
        } else {
            //Node<T> node = new Node<>(null, last, element);
            last.next = node;
            last = node;
        }
        size++;
    }

    @Override
    public T get(int index) {
        Node<T> needle = getNodeByIndex(index);
        return needle.element;
    }

    @Override
    public void set(int index, T value) {
        Node<T> needle = getNodeByIndex(index);
        needle.element = value;
    }

    private Node<T> getNodeByIndex(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        Node<T> res = first;
        for (int i = 0; i < index; i++) {
            res = res.next;  // moves res via link next one step further
        }
        return res;
    }

    @Override
    public T removeById(int index) {
        Node<T> needle = getNodeByIndex(index);
        T res = needle.element;
        deleteNode(needle);
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public boolean remove(T obj) {
        Node<T> node = findNode(obj);

        if (node == null)
            return false;

        deleteNode(node);
        return true;
    }

    @Override
    public boolean contains(T obj) {
        if (size == 0)
            return false;


        Node<T> node = this.first;

        do {
            if (node.element.equals(obj))
                return true;
            node = node.next;
        } while (node != null);

        return false;
    }

    @Override
    public Iterator<T> forwardIterator() {
        Iterator<T> iterator = new ForwardIterator();
        return iterator;
    }

    @Override
    public Iterator<T> backwardIterator() {
        Iterator<T> iterator = new BackwardIterator();
        return iterator;
    }

    @Override
    public Iterator<T> iterator() {
        return forwardIterator();
    }


    private class ForwardIterator implements Iterator<T> {

        Node<T> currentNode = first;


        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (currentNode == null)
                throw new IndexOutOfBoundsException();

            T res = currentNode.element;

            currentNode = currentNode.next;
            return res;
        }
    }


    private class BackwardIterator implements Iterator<T> {

        Node<T> currentNode = last;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (currentNode == null)
                throw new IndexOutOfBoundsException();

            T res = currentNode.element;

            currentNode = currentNode.prev;
            return res;
        }

    }


    private void deleteNode(Node<T> needle) {

        if (needle.next != null)           //if it is not the last element in the list
            needle.next.prev = needle.prev;
        else
            this.last = needle.prev;

        if (needle.prev != null)    //if it is not the first element in the list
            needle.prev.next = needle.next;
        else
            this.first = needle.next;

        size--;
    }


    private Node<T> findNode(T needle) {

        if (size == 0)
            return null;

        Node<T> node = this.first;

        if (needle != null) {
            do {
                if (node.element.equals(needle))
                    return node;
                else {
                    node = node.next;
                }
            } while (node != null);
        } else {
            do {
                if (node.element == null)
                    return node;
                else {
                    node = node.next;
                }
            } while (node != null);
        }

        return null;
    }

    private static class Node<T> {
        Node<T> next;
        Node<T> prev;
        T element;

        public Node() {
        }

        public Node(Node<T> next, Node<T> prev, T element) {
            this.next = next;
            this.prev = prev;
            this.element = element;
        }
    }
}