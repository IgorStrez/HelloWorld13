package Bobr.l22.animal;


public class Animal {
    public int weight;
    public String name;

    public int age;

    public Animal (int weight, String name, int age) {
        this.weight = weight;
        this.name = name;
        this.age = age;
    }
    public String toString () {
        return weight + ", " + this.name + ", " + age;
    }

}
