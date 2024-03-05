package hausaufgaben.l17.transport;

public class Car {
    String name;
    int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;

    }

    public String toString() {
        return "Car, " + this.name + "," + speed;
    }
}
