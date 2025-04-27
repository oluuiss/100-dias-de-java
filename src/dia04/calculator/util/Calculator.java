package calculator.util;

public class Calculator {
    public static double pi = 3.14;
    public static double radius;
    public static double circumference;
    public static double volume;

    public static double circumference() {
        return 2.0 * pi * radius;
    }

    public static double volume() {
        return 4.0 * pi * Math.pow(radius, 3) / 3.0;
    }
}


