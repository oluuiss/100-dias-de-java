package dia05.construtores.entities;
   
public class StockManager {
    // atributos
    public String nomeProduto;
    public int quantidade;
    public double preco;

    public StockManager(String nomeProduto, int quantidade, double preco) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

}
