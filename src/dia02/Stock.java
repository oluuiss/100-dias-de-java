package dia02;
import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        StockManager stock = new StockManager();
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter product data:");
        System.out.print("Name: ");
        stock.nomeProduto= sc.nextLine();
        System.out.print("Price: ");
        stock.preco = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        stock.quantidade = sc.nextInt();
        System.out.println("\nProduct data: "+ stock.nomeProduto+", $"+ stock.preco+", "+ stock.quantidade+" units, Total: $"+ stock.quantidade*stock.preco);
        System.out.println("Enther the number of products to be added to stock: ");
        int added = sc.nextInt();
        double newAddQuant = stock.quantidade + added;
        System.out.println("Updated data: "+ stock.nomeProduto+", $"+ stock.preco+", "+ newAddQuant+" units, Total: $"+ newAddQuant*stock.preco);
        // remoção
        System.out.print("Enter the number of products to be removed from stock: ");
        int removed = sc.nextInt();
        double newRemoveQuant = newAddQuant - removed;
        if (newRemoveQuant < 0) {
            System.out.println("Error: Not enough stock to remove " + removed + " units.");
        } else {
            System.out.println("Updated data: " + stock.nomeProduto + ", $" + stock.preco + ", " + newRemoveQuant + " units, Total: $" + newRemoveQuant * stock.preco);
        }
    }
    }
}

// há outras formas de fazer, porém como só foi pedido para fazer isso, fiz dessa forma básica.
