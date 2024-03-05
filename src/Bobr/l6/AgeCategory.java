package Bobr.l6;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentYear = 2024;

        // Считываем год рождения пользователя из ввода
        System.out.print("Введите год рождения: ");
        int birthYear = scanner.nextInt();

        // Вычисляем возраст пользователя
        int age = currentYear - birthYear;

        // Определяем категорию возраста с использованием тернарного оператора
        String ageCategory = (age < 0 || age > 150) ? "ошибка" :
                (age > 0 && age <= 14) ? "ребенок" :
                        (age > 14 && age <= 18) ? "подросток" :
                                (age > 18 && age <= 60) ? "взрослый" :
                                        "пожилой";

        // Выводим результат
        if (ageCategory.equals("ошибка")) {
            System.out.println("Ошибка: некорректный возраст");
        } else {
            System.out.println("Ваш возраст: " + age + " лет. Вы - " + ageCategory + ".");
        }
    }
}