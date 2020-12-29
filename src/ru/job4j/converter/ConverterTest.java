package ru.job4j.converter;

public class ConverterTest {

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static class Converter {
        public static int rubleToEuro(int valve) {
            return valve / 70;
        }

        public static int rubleToDollars(int valve) {
            return valve / 60;
        }

        @SuppressWarnings("checkstyle:EmptyLineSeparator")
        public static void main(String[] args) {
            int euro = ru.job4j.converter.Converter.rubleToEuro(140);
            int dollars = ru.job4j.converter.Converter.rubleToDollars(120);
            System.out.println("140 ruble are " + euro + " euro");
            System.out.println("120 ruble are " + dollars + " dollars");
            int valve1 = 140;
            int valve2 = 120;
            int expected1 = 2;
            int expected2 = 2;
            int out1 = ru.job4j.converter.Converter.rubleToEuro(valve1);
            int out2 = ru.job4j.converter.Converter.rubleToDollars(valve2);
            boolean passed1 = expected1 == out1;
            boolean passed2 = expected2 == out2;
            System.out.println("140 ruble are 1. Test result : " + passed1);
            System.out.println("120 ruble are 2. Test result : " + passed2);
        }
    }


}
