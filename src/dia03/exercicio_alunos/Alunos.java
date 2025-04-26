package dia03.exercicio_alunos;

import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunosDAO aluno = new AlunosDAO();
        System.out.print("\nNome do aluno: ");
        aluno.Nome = sc.nextLine();
        System.out.print("Nota 1: ");
        aluno.Nota1 = sc.nextDouble();
        if (aluno.Nota1 > 30) {
            System.out.println("Nota superior a 30. Por favor, insira um número entre 0 e 30.");
        } else if (aluno.Nota1 < 0) {
            System.out.println("Nota inferior a 0. Por favor, insira um número entre 0 e 30.");
        }
        System.out.print("Nota 2: ");
        aluno.Nota2 = sc.nextDouble();
        if (aluno.Nota2 > 35) {
            System.out.println("Nota superior a 30. Por favor, insira um número entre 0 e 30.");
        } else if (aluno.Nota2 < 0) {
            System.out.println("Nota inferior a 0. Por favor, insira um número entre 0 e 30.");
        }
        System.out.print("Nota 3: ");
        aluno.Nota3 = sc.nextDouble();
        if (aluno.Nota3 > 35) {
            System.out.println("Nota superior a 30. Por favor, insira um número entre 0 e 30.");
        } else if (aluno.Nota3 < 0) {
            System.out.println("Nota inferior a 0. Por favor, insira um número entre 0 e 30.");
        }

        if (aluno.CalcularNota() >= 60) {
            System.out.println("FINAL GRADE = " + (aluno.Nota1+aluno.Nota2+aluno.Nota3));
            System.out.println("PASS");
        } else if (aluno.CalcularNota() < 60) {
            System.out.println("FAILED");
            System.out.println("MISSING: "+ (60-aluno.CalcularNota()) + " points");
        }
        
    }
}
