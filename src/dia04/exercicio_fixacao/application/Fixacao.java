package dia04.exercicio_fixacao.application;

/*
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado
 * por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando
 * ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe
 * CurrencyConverter para ser responsável pelos cálculos.
 */

import java.util.Scanner;
import dia04.exercicio_fixacao.util.CurrencyConventer;

public class Fixacao {
    
    public static void main(String[] args) {
        CurrencyConventer cc = new CurrencyConventer();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nWhat is the dollar price? ");
        cc.dollarPrice = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        cc.dollarAmount = sc.nextDouble();
        System.out.print("Amount to be paid in reais = " + cc.dolarInReais() + "\n");


    }
}
