package Bobr.l23.animal;

public class Dog extends Animal {

    protected String breed;

    public Dog(int weight, String name, int age, String breed) {
        super (weight, name, age);
        this.breed = breed;
    }
    public String toString () {
        return super.toString() + ", " + breed;
    }
}