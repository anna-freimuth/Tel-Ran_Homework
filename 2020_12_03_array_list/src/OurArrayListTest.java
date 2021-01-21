import org.junit.jupiter.api.BeforeEach;

class OurArrayListTest extends OurListTest {
    @BeforeEach
    public void init() {
        list = new OurArrayList<>();
        stringList = new OurArrayList<>();
        integerOurList = new OurLinkedList<>();
    }
}
