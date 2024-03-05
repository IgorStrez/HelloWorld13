package Bobr.l35;

public class Bobr implements Comparable<Bobr>{
    private String name;
    private int age;
    private int relativesCount;

    public Bobr(String name, int age, int relativesCount) {
        this.name = name;
        this.age = age;
        this.relativesCount = relativesCount;
    }

    @Override
    public int compareTo(Bobr otherBobr) {
        return Integer.compare(this.age, otherBobr.age);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRelativesCount() {
        return relativesCount;
    }

    public void setRelativesCount(int relativesCount) {
        this.relativesCount = relativesCount;
    }

}
