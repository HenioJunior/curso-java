package _08_introducao_programacao_oo._073_exercicio_conversao_dolar.util;

public class CurrencyConverter {

    public static final double IOF = 1 + 6.0/100;

    public static double converter(double dollarPrice, double amount) {
        return amount * dollarPrice * IOF ;
    }
}
