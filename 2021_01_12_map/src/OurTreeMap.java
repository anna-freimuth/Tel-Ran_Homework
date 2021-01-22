
import java.util.Comparator;
import java.util.Iterator;


public class OurTreeMap<K, V> implements OurMap<K, V> {

    private static class Node<K, V> {
        Node<K, V> left;
        Node<K, V> right;
        Node<K, V> parent;
        K key;
        V value;

        public Node(K key, V value, Node<K, V> parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }

    }

    private final Comparator<K> keyComparator;
    private Node<K, V> root; //0
    private int size;

    public OurTreeMap(Comparator<K> keyComparator) {
        this.keyComparator = keyComparator;

    }

    /**
     * If we use this constructor in the client code, that means that the keys are Comparable
     */
    public OurTreeMap() {
        this.keyComparator = new Comparator<K>() {
            @Override
            public int compare(K o1, K o2) {
                Comparable<K> comparableO1 = (Comparable<K>) o1;
                return comparableO1.compareTo(o2);
            }
        };
    }

    private Node<K, V> findNode(K key) {
        Node<K, V> current = root;

        while (current != null) {
            int compared = keyComparator.compare(key, current.key);

            if (compared > 0)
                current = current.right;
            else if (compared < 0)
                current = current.left;
            else {
                return current;
            }
        }
        return null;
    }


    @Override
    public V put(K key, V value) {
        if (key == null) {
            throw new NullPointerException();
        }
        Node<K, V> current = root;
        Node<K, V> parent = null;
        int compared = 0;
        while (current != null) {
            parent = current;
            compared = keyComparator.compare(key, current.key);

            if (compared > 0)
                current = current.right;
            else if (compared < 0)
                current = current.left;
            else {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
        }
        Node<K, V> newNode = new Node<>(key, value, parent);

        if (compared > 0) {
            parent.right = newNode;
        } else if (compared < 0) {
            parent.left = newNode;
        } else {
            root = newNode;
        }
        size++;
        return null;
    }


    @Override
    public V get(K key) {
        Node<K, V> node = findNode(key);
        return node == null ? null : node.value;
    }


    @Override
    public V remove(K key) {
        Node<K, V> nodeToRemove = findNode(key);
        if (nodeToRemove == null)
            return null;

        size--;
        if (nodeToRemove.left != null && nodeToRemove.right != null)
            return junctionRemove(nodeToRemove);

        return linearRemove(nodeToRemove);
    }

    private V linearRemove(Node<K, V> nodeToRemove) {
        if (root == null)
            return null;

        Node<K, V> nextLeft = nodeToRemove.left;
        Node<K, V> nextRight = nodeToRemove.right;
        if (nodeToRemove.left != null) {
            replaceNodeInParent(nodeToRemove, nextLeft);
            nextLeft.parent = nodeToRemove.parent;
        } else if (nodeToRemove.right != null) {
            replaceNodeInParent(nodeToRemove, nextRight);
            nextRight.parent = nodeToRemove.parent;
        } else {
            replaceNodeInParent(nodeToRemove, null);
        }

        return nodeToRemove.value;
    }

    private void replaceNodeInParent(Node<K, V> toBeReplaced, Node<K, V> replacement) {

        Node<K, V> parent = toBeReplaced.parent;
        if (parent == null) return;

        if (parent.left != null && 0 == keyComparator.compare(parent.left.key, toBeReplaced.key))
            parent.left = replacement;
        else
            parent.right = replacement;
    }

    private V junctionRemove(Node<K, V> nodeToRemove) {
        Node<K, V> nextNode = findNextInRightBranch(nodeToRemove);
        V oldValue = nodeToRemove.value;
        nodeToRemove.key = nextNode.key;
        nodeToRemove.value = nextNode.value;
        linearRemove(nextNode);
        return oldValue;
    }

    private Node<K, V> findNextInRightBranch(Node<K, V> node) {
        Node<K, V> current = node;
        current = current.right;
        while (current.left != null) {
            current = current.left;
        }
        return current;

    }

    @Override
    public boolean containsKey(K key) {
        return findNode(key) != null;
    }

    @Override
    public int size() {
        return size;
    }

    private Node<K, V> findMinNode() {
        Node<K, V> current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private Node<K, V> findNextRightParent(Node<K, V> current) {
        while (current.parent != null && current.parent.left != current) {
            current = current.parent;
        }
        return current.parent;
    }

    @Override
    public Iterator<K> keyIterator() {
        return new KeyIterator();
    }

    @Override
    public Iterator<V> valueIterator() {
        return null;
    }

    private class KeyIterator implements Iterator<K> {

        Node<K, V> current;
        int currentElementNumber;

        public KeyIterator() {
            if (size > 0)
                current = findMinNode();
        }

        @Override
        public boolean hasNext() {
            return currentElementNumber < size;
        }

        @Override
        public K next() {
            if (currentElementNumber == size)
                throw new IndexOutOfBoundsException();

            K result = current.key;
            if (current.right != null)
                current = findNextInRightBranch(current);
            else
                current = findNextRightParent(current);

            currentElementNumber++;
            return result;
        }
    }
}
