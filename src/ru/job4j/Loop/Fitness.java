package ru.job4j.Loop;

public class Fitness {
    public static int calc (int ivan, int nik) {
        int month = 0;
        while (month++ <= ivan)  {
            ivan *= 3;
            nik *= 2;

        }

        return month;
    }

    public static void main(String[] args) {
        System.out.println(calc(95, 90));
        System.out.println(calc(90, 95));
        System.out.println(calc(50, 90));
    }

}

