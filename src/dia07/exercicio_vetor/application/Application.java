/*
fazer um programa para ler um numero inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas
 */

package dia07.exercicio_vetor.application;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        double media = soma / n;
        System.out.printf("MEDIA = %.2f%n", media);
        sc.close();
    }
}
