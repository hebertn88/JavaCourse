package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double currencyConverter(double dollarPrice, double valueToConverter) {
        return (dollarPrice + dollarPrice * IOF) * valueToConverter;
    }
}
