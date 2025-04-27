package dia04.exercicio_fixacao.util;

public class CurrencyConventer {
    public static final double IOF = 0.06;
    public static double dollarPrice;
    public static double dollarAmount;

    public static double dolarInReais() {
        return dollarAmount * dollarPrice + (dollarAmount * dollarPrice * IOF);
    }

}
