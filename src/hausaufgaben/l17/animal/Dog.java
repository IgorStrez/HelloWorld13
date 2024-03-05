package hausaufgaben.l17.animal;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public String toString() {
        return "Dog, " + this.name + "," + weight;
    }
}
