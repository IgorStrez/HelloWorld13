package Bobr.l19.people;
import java.util.Scanner;
public class Man {
    String name;
    int age;
    private final static int chromosomNumber;

    static {
        System.out.println("Введите номер хромосомы Мужчины: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String toString() {
            return "Man, " + this.name + "," + age + " ,Номер хромосомы: " + chromosomNumber;
        }
}
