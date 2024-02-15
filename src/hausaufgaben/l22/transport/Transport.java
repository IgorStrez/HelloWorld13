package hausaufgaben.l22.transport;


public class Transport {
    public String colour;
    public String brand;

    public int age;

    public Transport (String colour, String brand, int age) {
        this.colour = colour;
        this.brand = brand;
        this.age = age;
    }
    public String toString () {
        return colour + ", " + this.brand + ", " + age;
    }

}
