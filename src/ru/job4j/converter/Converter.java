package ru.job4j.converter;

public class Converter {
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
    }
}
