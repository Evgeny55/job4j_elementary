package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int valve) {
        int rsl = valve / 70;
        return rsl;
    }

    public static int rubleToDollars(int valve) {
        int rsl = valve / 60;
        return rsl;

    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollars = Converter.rubleToDollars(120);
        System.out.println("140 ruble are " + euro + " euro");
        System.out.println("120 ruble are " + dollars + " dollars");
    }
}
