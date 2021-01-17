package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        return left >= right ? left : right;
    }
}


    private static int max(int i) {
        int sum = Max.max(5);
        return sum;
    }
}
