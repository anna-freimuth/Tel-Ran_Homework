import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    Node nine = new Node(null, null);
    Node seven = new Node(null, null);
    Node eight = new Node(nine, null);
    Node six = new Node(seven, eight);
    Node five = new Node(null, six);
    Node three = new Node(null, null);
    Node one = new Node(null, null);
    Node two = new Node(one, three);
    Node four = new Node(two, five); //root

    @Test
    public void getVertexNumber_9Node_expected1() {
        assertEquals(1, Node.getVertexNumber(nine));
    }

    @Test
    public void getVertexNumber_4Node_expected9() {
        assertEquals(9, Node.getVertexNumber(four));
    }

    @Test
    public void getVertexNumber_2Node_expected3() {
        assertEquals(3, Node.getVertexNumber(two));
    }

    @Test
    public void getVertexNumber_5Node_expected5() {
        assertEquals(5, Node.getVertexNumber(five));
    }

    @Test
    public void getVertexNumber_1Node_expected1() {
        assertEquals(1, Node.getVertexNumber(one));
    }

    @Test
    public void getHeight_9Node_expected1() {
        assertEquals(1, Node.getHeight(nine));
    }

    @Test
    public void getHeight_4Node_expected5() {
        assertEquals(5, Node.getHeight(four));
    }
}
