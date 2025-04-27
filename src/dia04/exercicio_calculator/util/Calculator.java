package dia04.exercicio_calculator.util;

public class Calculator {
    public static final double PI = 3.14;
    public static double radius;
    public static double circumference;
    public static double volume;

    public static double circumference() {
        return 2.0 * PI * radius;
    }

    public static double volume() {
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
    }
}


