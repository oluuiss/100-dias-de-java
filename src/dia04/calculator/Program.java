package calculator;

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
