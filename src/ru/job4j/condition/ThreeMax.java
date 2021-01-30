package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int rsl = first;
        if (first > second && first < third) {
            rsl = second;
        }
        if (second < first && second < third) {
            rsl = third;
        }
        return rsl;
    }
}
