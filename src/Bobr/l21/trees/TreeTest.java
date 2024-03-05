package Bobr.l21.trees;
import org.junit.jupiter.api.*;

public class TreeTest {

    @Test
    public void testBeech() {
        Beech beech = new Beech("Vasa", 13);
        Assertions.assertEquals("Beech, Vasa, 13", beech.toString());
    }

    @Test
    public void testBirch() {
        Birch birch = new Birch("Lena", 10);
        Assertions.assertEquals("Birch, Lena, 10", birch.toString());
    }

    @Test
    public void testOak() {
        Oak oak = new Oak("Artem", 17);
        Assertions.assertEquals("Oak, Artem, 17", oak.toString());
    }
}
