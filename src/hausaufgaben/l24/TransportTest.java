package hausaufgaben.l24;

import org.junit.jupiter.api.*;

public class TransportTest {

    @Test
    public void testEqualsAndHashCode() {
        Transport transport1 = new Transport("red", "VW", 13);
        Transport transport2 = new Transport("green", "VAZ", 31);
        Transport transport3 = new Transport("red", "VW", 13);

        Assertions.assertEquals(transport1, transport3);
        Assertions.assertNotEquals(transport1, transport2);

        Assertions.assertEquals(transport1.hashCode(), transport3.hashCode());
        Assertions.assertNotEquals(transport1.hashCode(), transport2.hashCode());
    }
}
