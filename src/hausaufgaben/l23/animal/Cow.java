package hausaufgaben.l23.animal;

public class Cow extends Animal {

    protected int volume;

    public Cow(int weight, String name, int age, int volume) {
        super (weight, name, age);
        this.volume = volume;
    }
    public String toString () {
        return super.toString() + ", " + volume;
    }
}