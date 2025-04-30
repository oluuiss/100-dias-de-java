package  dia07.exercicio_banco.application;

import dia07.exercicio_banco.util.AccountDAO;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        AccountDAO bank = new AccountDAO();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        bank.accountNumber = sc.nextInt();
        bank.buffer = sc.nextLine();
        System.out.print("Enter account holder: ");
        bank.name = sc.nextLine();
        System.out.print("Is there a initial deposit? [Y/N]: ");
        bank.yN = sc.nextLine();
        if(bank.yN.equals("Y")){
            System.out.print("Enter initial deposit value: ");
            bank.amount = sc.nextDouble();

            System.out.println("\nAccount data:");
            System.out.println("Account "+ bank.accountNumber +", Holder: "+bank.name+", Balance: $"+bank.amount);

            System.out.print("\nEnter a deposit value: ");
            bank.newAmount = sc.nextDouble();
            System.out.println("Updated account data:");
            System.out.println("Account "+ bank.accountNumber +", Holder: "+bank.name+", Balance: $"+bank.Soma());

            System.out.print("\nEnter a withdraw value: ");
            bank.newAmount = sc.nextDouble();
            System.out.println("Updated account data:");
            System.out.print("Account "+ bank.accountNumber +", Holder: "+bank.name+", Balance: $"+bank.Substituicao());


        } else {
            return;
        }
    }
}
