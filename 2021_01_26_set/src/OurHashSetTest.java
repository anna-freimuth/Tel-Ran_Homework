import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


class OurHashSetTest extends OurSetTest {

    @BeforeEach
    public void init() {
        set1 = new OurHashSet<>();
        set2 = new OurHashSet<>();
    }
}
