package Bobr.l24;

public class People {
    protected String gender;
    protected String name;
    protected int age;

    public People(String gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        People people = (People) obj;
        return  (gender == null ? people.gender == null : gender.equals(people.gender)) &&
                (name == null ? people.name == null : name.equals(people.name)) &&
                age == people.age;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 13 * result + age;
        return result;
    }

}
