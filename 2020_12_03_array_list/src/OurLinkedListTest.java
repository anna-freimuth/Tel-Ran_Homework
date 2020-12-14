import org.junit.jupiter.api.BeforeEach;

class OurLinkedListTest extends OurListTest {

    @BeforeEach
    public void init() {
        list = new OurLinkedList<>();
        stringList = new OurLinkedList<>();
    }

}
