package calculator.application;

/* 
 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria
 * o valor de uma circunferência e do volume de uma esfera para um raio daquele valor.
 * Informar também o valor de PI, com duas casas decimais.
 */

import calculator.util.Calculator;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("\nEnter the radius: ");
        calc.radius = sc.nextDouble();
        System.out.printf("Circumference: %.2f%n", calc.circumference());
        System.out.printf("Volume: %.2f%n", calc.volume());
        System.out.printf("Pi: " + calc.pi + "\n");
        sc.close();
    }
}
