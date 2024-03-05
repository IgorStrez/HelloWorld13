package hausaufgaben.l19.transport;

public class Bike {
    String name;
    int speed;

    public Bike(String name, int speed) {
        this.name = name;
        this.speed = speed;

    }

    public String toString() {
        return "Bike, " + this.name + "," + speed;
    }
}
