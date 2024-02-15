package hausaufgaben.l21.trees;

public class Birch {
    String name;
    int height;

    public Birch(String name, int height) {
        this.name = name;
        this.height = height;

    }

    public String toString() {
        return "Birch, " + this.name + ", " + height;
    }
}
