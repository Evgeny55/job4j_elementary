package ru.job4j.condition;

public class Area {
    public static double area(double a, double b, double c) {
        double x = Math.sqrt(a + b + c);
        return x;
    }

    public static void main(String[] args) {
        double x = Area.area(2,2,2);
        System.out.println("area (2, 2, 2) = " + x);
    }
}
