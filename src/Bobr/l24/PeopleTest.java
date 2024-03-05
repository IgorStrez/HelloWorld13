package Bobr.l24;

import org.junit.jupiter.api.*;

public class PeopleTest {

    @Test
    public void testEqualsAndHashCode() {
        People people1 = new People("Man", "Vasa", 24);
        People people2 = new People("Man", "Vasa", 24);
        People people3 = new People ("Woman", "Renata", 42);

        Assertions.assertEquals(people1, people2);
        Assertions.assertNotEquals(people1, people3);

        Assertions.assertEquals(people1.hashCode(), people2.hashCode());
        Assertions.assertNotEquals(people1.hashCode(), people3.hashCode());
    }
}
