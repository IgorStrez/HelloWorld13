package Bobr.l14;

import java.util.Scanner;

public class CurrencyConverterAlt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cur = {"EURO", "USD", "TL"};
        double[] exRates = {1.0, 0.94, 0.03};
        String curFrom, curIn;
        double sum;

        printWelcomeMessage(cur);

        do {
            System.out.print("Введите доступное значение: ");
            curFrom = scan.next();

            if (curFrom.equalsIgnoreCase("exit")) {
                break;
            }

            double x = getRateValue(curFrom, exRates);

            if (x == -1) {
                System.out.println("Ошибка: Введена некорректная валюта.\n");
                continue;
            }

            System.out.print("Введите валюту: ");
            curIn = scan.next();

            double y = getRateValue(curIn, exRates);

            if (y == -1) {
                System.out.println("Ошибка: Введена некорректная валюта.\n");
                continue;
            }

            System.out.print("\nВведите сумму перевода: ");
            sum = scan.nextDouble();

            double total = sum * x / y;

            System.out.println("\nВы получаете: " + total + "\n");

        } while (true);

        scan.close();
    }

    private static double getRateValue(String currency, double[] rates) {
        switch (currency.toUpperCase()) {
            case "EURO":
                System.out.println("Курс для " + currency + ": " + rates[0]);
                return rates[0];
            case "USD":
                System.out.println("Курс для " + currency + ": " + rates[1]);
                return rates[1];
            case "TL":
                System.out.println("Курс для " + currency + ": " + rates[2]);
                return rates[2];
            default:
                return -1;
        }
    }

    private static void printWelcomeMessage(String[] cur) {
        System.out.println(
                "Приветствуем в Currency Converter\n\n" +
                        "Выберите исходную валюту:\n");

        for (int i = 0; i < cur.length; i++) {
            System.out.println((i + 1) + ". " + cur[i]);
        }

        System.out.println("\nВведите 'exit' для завершения.\n");
    }
}
