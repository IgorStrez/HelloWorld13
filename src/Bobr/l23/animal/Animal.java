package Bobr.l23.animal;


public class Animal {
    protected int weight;
    protected String name;
    protected int age;

    public Animal (int weight, String name, int age) {
        this.weight = weight;
        this.name = name;
        this.age = age;
    }
    public String toString () {
        return weight + ", " + this.name + ", " + age;
    }

}
