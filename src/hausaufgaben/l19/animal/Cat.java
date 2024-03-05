package hausaufgaben.l19.animal;

import java.util.Scanner;

public class Cat {
    String name;
    int weight;
    private final static int chromosomNumber;

    static {
        System.out.println("Введите номер хромосомы Кота: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public String toString() {
        return "Cat, " + this.name + "," + weight + " ,Номер хромосомы: " + chromosomNumber;
    }
}
