package hausaufgaben.l15;

import java.util.Scanner;

public class CurrencyConverterCLI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        printWelcomeMessage(converter.getAvailableCurrencies());

        do {
            System.out.print("Выберите доступную валюту: ");
            String curFrom = scan.next();

            if (curFrom.equalsIgnoreCase("exit")) {
                break;
            }

            double x = converter.getRateValue(curFrom);

            if (x == -1) {
                System.out.println("Ошибка: Введена некорректная валюта.\n");
                continue;
            }

            System.out.print("Введите необходимую валюту: ");
            String curIn = scan.next();

            double y = converter.getRateValue(curIn);

            if (y == -1) {
                System.out.println("Ошибка: Введена некорректная валюта.\n");
                continue;
            }

            System.out.print("\nВведите сумму перевода: ");
            double sum = scan.nextDouble();

            double total = sum * x / y;

            System.out.println("\nВы получаете: " + total + "\n");

        } while (true);

        scan.close();
    }

    private static void printWelcomeMessage(String[] cur) {
        System.out.println(
                "Приветствуем в Currency Converter\n\n" +
                        "Список доступных валют:\n");

        for (int i = 0; i < cur.length; i++) {
            System.out.println((i + 1) + ". " + cur[i]);
        }

        System.out.println("\nВведите 'exit' для завершения.\n");
    }
}
