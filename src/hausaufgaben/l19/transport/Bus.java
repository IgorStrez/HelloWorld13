package hausaufgaben.l19.transport;

public class Bus {
    String name;
    int speed;

    public Bus(String name, int speed) {
        this.name = name;
        this.speed = speed;

    }

    public String toString() {
        return "Bus, " + this.name + "," + speed;
    }
}
