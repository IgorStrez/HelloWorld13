package hausaufgaben.l15;

public class CurrencyConverter {
    private double[] currencyRates;
    private String[] availableCurrencies;

    // Пустой конструктор для задания значений по умолчанию
    public CurrencyConverter() {
        this.currencyRates = new double[]{1.0, 0.94, 0.03}; // Значения по умолчанию
        this.availableCurrencies = new String[]{"EURO", "USD", "TL"}; // Значения по умолчанию
    }

    // Конструктор, принимающий только курсы валют
    public CurrencyConverter(double[] currencyRates) {
        this.currencyRates = currencyRates;
        this.availableCurrencies = new String[]{"EURO", "USD", "TL"}; // Значения по умолчанию
    }

    // Конструктор, принимающий курсы валют и доступные валюты
    public CurrencyConverter(double[] currencyRates, String[] availableCurrencies) {
        this.currencyRates = currencyRates;
        this.availableCurrencies = availableCurrencies;
    }

    // Метод для получения курса валюты
    public double getRateValue(String currency) {
        switch (currency.toUpperCase()) {
            case "EURO":
                return this.currencyRates[0];
            case "USD":
                return this.currencyRates[1];
            case "TL":
                return this.currencyRates[2];
            default:
                return -1;
        }
    }

    // Метод для получения доступных валют
    public String[] getAvailableCurrencies() {
        return this.availableCurrencies;
    }
}
