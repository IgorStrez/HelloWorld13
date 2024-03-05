package Bobr.l36;

import java.util.Objects;

public class Bobr {
    private String name;
    private int age;
    private int relativesCount;

    public Bobr(String name, int age, int relativesCount) {
        this.name = name;
        this.age = age;
        this.relativesCount = relativesCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRelativesCount() {
        return relativesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bobr bobr = (Bobr) o;
        return age == bobr.age &&
                relativesCount == bobr.relativesCount &&
                Objects.equals(name, bobr.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, relativesCount);
    }
}
