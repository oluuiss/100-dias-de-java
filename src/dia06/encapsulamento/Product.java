package dia06.encapsulamento;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNome do produto: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        Double price = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantity = sc.nextInt();
        Program prog = new Program(name, price, quantity);
        System.out.println("\nName: " + prog.name
        + "\nPrice: " + prog.price + "\nQuantity: " + prog.quantity);
        prog.setName("Computer");
        System.out.println("Update: "+ prog.getName());
    }
}