package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        return rsl;

        //double rsl = y2 - y1;
       // return rsl;

    }

    public static void main(String[] args) {
        double result1 = Point.distance(3,4,5,6);
        double result2 = Point.distance(3,4,5,6);
        System.out.println(result1);
        System.out.println(result2);
    }
}
