package dia02;

import java.util.Scanner;

public class Triangle {
    // atributos
    public float a;
    public float b;
    public float c;  
    

    public void calcularArea() {
        float s = (a + b + c) / 2;
        float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("A área do triângulo é: " + area);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle triangle = new Triangle();
        System.out.println("Digite os lados do triângulo:");
        System.out.print("Lado A: ");
        triangle.a = sc.nextFloat();
        System.out.print("Lado B: ");
        triangle.b = sc.nextFloat();
        System.out.print("Lado C: ");
        triangle.c = sc.nextFloat();

        triangle.calcularArea();
    }
}
