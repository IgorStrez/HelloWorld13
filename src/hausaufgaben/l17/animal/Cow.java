package hausaufgaben.l17.animal;

public class Cow {
    String name;
    int weight;

    public Cow(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public String toString() {
        return "Cow, " + this.name + "," + weight;
    }
}
