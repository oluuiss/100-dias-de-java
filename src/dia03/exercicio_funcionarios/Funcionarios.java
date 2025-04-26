package dia03.exercicio_funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in);
        FuncionariosDAO funcionario = new FuncionariosDAO();
        System.out.print("\nDigite o nome do funcionário: ");
        funcionario.Name = sc.nextLine();
        System.out.print("Digite o salário bruto: $");
        funcionario.GrossSalary = sc.nextDouble();
        System.out.print("Digite o imposto: $");
        funcionario.Tax = sc.nextDouble();
        System.out.println("Employee: " + funcionario.Name + ", $" + funcionario.GrossSalary);
        System.out.println("Salário líquido: $" + funcionario.SalarioLiquido());
        System.out.print("Digite a porcentagem de aumento: %");
        funcionario.Porcentagem = sc.nextDouble();
        System.out.println("Salário após aumento: " + (funcionario.SalarioLiquido()+funcionario.AumentarSalario()));
        sc.close();
    }
}
