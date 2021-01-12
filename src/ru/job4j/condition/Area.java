package ru.job4j.condition;

public class Area {
    private static java.lang.Object Math;
    private static java.lang.Object System;

    @SuppressWarnings("checkstyle:ParenPad")
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double x = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return x;
    }

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static <String> void main(String[] args) {
        double x = Area.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + x);
    }
}
