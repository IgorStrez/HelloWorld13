package Bobr.l24;
import org.junit.jupiter.api.*;
public class AnimalTest {

    @Test
    public void testEqualsAndHashCode() {
        Animal animal1 = new Animal(5, "Tom", 4);
        Animal animal2 = new Animal(5, "Tom", 4);
        Animal animal3 = new Animal (6, "Igor", 3);

        Assertions.assertEquals(animal1, animal2);
        Assertions.assertNotEquals(animal1, animal3);

        Assertions.assertEquals(animal1.hashCode(), animal2.hashCode());
        Assertions.assertNotEquals(animal1.hashCode(), animal3.hashCode());

    }
}
