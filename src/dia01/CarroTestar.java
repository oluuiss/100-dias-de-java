package dia01;

public class CarroTestar {
    public static void main(String[] args) {
        Carro car = new Carro();

        car.nome = "X6";
        car.marca = "BMw";
        car.ano = 2024;
        car.velocidade = 60;

        car.acelerar(80);
        System.out.println("öi, "+car.velocidade);

    }
}
