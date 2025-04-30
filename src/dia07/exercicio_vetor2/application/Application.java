package dia07.exercicio_vetor2.application;

import dia07.exercicio_vetor2.entities.ApplicationDAO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ApplicationDAO[] vetor = new ApplicationDAO[n];

        for (int i = 0; i < vetor.length; i++) {
            String buffer = sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new ApplicationDAO(name, price);
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i].getPrice();
        }
        double media = soma / n;
        System.out.println("Media: " + media);

        sc.close();
    }
}
