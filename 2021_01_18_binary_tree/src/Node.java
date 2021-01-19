public class Node {
    Node left;
    Node right;

    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public static int getHeight(Node root) {
        if (root == null)
            return -1;

        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static int getVertexNumber(Node root) {
        if (root == null)
            return 0;

        return getVertexNumber(root.left) + getVertexNumber(root.right) + 1;
    }
}
