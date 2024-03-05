package hausaufgaben.l17.animal;

public class Cat {
    String name;
    int weight;

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public String toString() {
        return "Cat, " + this.name + "," + weight;
    }
}
