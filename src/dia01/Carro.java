package dia01;

public class Carro {
    // atributos
    public String nome;
    // (tem que ser public para chamar a funcao em outra classe. usamos private
    // apenas na classe na qual ela está atribuida).
    public String marca;
    public int ano;
    public int velocidade;

    // metodos
    public void acelerar(int aceleracao){
        velocidade+=aceleracao;
    }
    public void frear(int reduzir){
        velocidade-=reduzir;
    }
    public void buzinar(int buzina){
        System.out.println("Biii");
    }

}