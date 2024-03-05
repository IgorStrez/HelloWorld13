package Bobr.l19.people;

import java.util.Scanner;
public class Woman {
    String name;
    int age;
    private final static int chromosomNumber;

    static {
        System.out.println("Введите номер хромосомы Женщины: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }

    public Woman (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Woman, " + this.name + "," + age + " ,Номер хромосомы: " + chromosomNumber;

        }
}
