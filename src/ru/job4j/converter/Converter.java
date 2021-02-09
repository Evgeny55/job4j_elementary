package ru.job4j.converter;

public class Converter {
    public static int calc;

    public static int rubleToEuro(int valve) {
        return valve / 70;
    }

    public static int rubleToDollars(int valve) {
        return valve / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollars = Converter.rubleToDollars(120);
        System.out.println("140 ruble are " + euro + " euro");
        System.out.println("120 ruble are " + dollars + " dollars");
        int valve1 = 140;
        int valve2 = 120;
        int expected1 = 2;
        int expected2 = 2;
        int out1 = Converter.rubleToEuro(valve1);
        int out2 = Converter.rubleToDollars(valve2);
        boolean passed1 = expected1 == out1;
        boolean passed2 = expected2 == out2;
        System.out.println("140 ruble are 1. Test result : " + passed1);
        System.out.println("120 ruble are 2. Test result : " + passed2);
    }
}
