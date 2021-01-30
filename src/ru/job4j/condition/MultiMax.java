package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int rsl = first;
        if (first < second) {
            rsl = second;
        } else if (second > third) {
            rsl = third;
        }
        return rsl;
    }
}
