package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
       return Math.pow((x2 - x1), 2);
    }

//    public  static double distance(int x1, int y1, int x2, int y2) {
//        return Math.sqrt((y2 - y1), 2);
//    }

    public static void main(String[] args) {
        double result1 = Point.distance(3,4,5,6);
        //int result2 = Point.distance(3,4,5,6);
        System.out.println("result1 (3, 4) to (5, 6) " + result1);
        //System.out.println("result2 (3, 4) to (5, 6) " + result2);
    }
}
