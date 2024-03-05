package Bobr.l21.animal;

import java.util.Scanner;

public class Cow {
    String name;
    int weight;
    private final static int chromosomNumber;

    static {
        System.out.println("Введите номер хромосомы Коровы: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }

    public Cow(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public String toString() {
        return "Cow, " + this.name + "," + weight + " ,Номер хромосомы: " + chromosomNumber;
    }
}
