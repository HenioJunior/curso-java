package exercicios._073_conversao_dolar.util;

public class CurrencyConverter {

    public static final double IOF = 1 + 6.0/100;

    public static double converter(double dollarPrice, double amount) {
        return amount * dollarPrice * IOF ;
    }
}
