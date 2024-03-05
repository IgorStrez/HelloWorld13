package Bobr.l23.animal;

public class Cat extends Animal {

    protected String colour;

    public Cat(int weight, String name, int age, String colour) {
        super (weight, name, age);
        this.colour = colour;
    }
    public String toString () {
        return super.toString() + ", " + colour;
    }
}