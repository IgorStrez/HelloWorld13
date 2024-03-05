package Bobr.l24;


public class Animal {
    protected int weight;
    protected String name;
    protected int age;

    public Animal (int weight, String name, int age) {
        this.weight = weight;
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal animal = (Animal) obj;
        return weight == animal.weight &&
                age == animal.age &&
                (name == null ? animal.name == null : name.equals(animal.name));
    }

    @Override
    public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 13 * result + weight;
            return result;
    }
 }
