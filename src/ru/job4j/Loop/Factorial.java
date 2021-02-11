package ru.job4j.Loop;

public class Factorial {
    public static int calc(int n) {
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl = rsl * i;
        }

        return rsl;
    }

    public static void main(String[] args) {
        int rsl = Factorial.calc(5);
        System.out.println(rsl);
    }
}