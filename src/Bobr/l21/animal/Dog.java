package Bobr.l21.animal;

import java.util.Scanner;

public class Dog {
    String name;
    int weight;
    private final static int chromosomNumber;

    static {
        System.out.println("Введите номер хромосомы Собаки: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public String toString() {
        return "Dog, " + this.name + "," + weight + " ,Номер хромосомы: " + chromosomNumber;
    }
}
