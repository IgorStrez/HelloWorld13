package Bobr.l21.trees;

public class Oak {
    String name;
    int height;

    public Oak(String name, int height) {
        this.name = name;
        this.height = height;

    }

    public String toString() {
        return "Oak, " + this.name + ", " + height;
    }
}

