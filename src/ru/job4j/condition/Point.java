package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
       double x = Math.pow((x2 - x1), 2); //я сделал а объяснить не могу как
       double y = Math.pow((y2 - y1), 2); //этот вариант тоже
       return Math.sqrt (x + y); //тут мы вернули значение корень квадратный ?
       // для меня загадка как я сделал !!!
    }

    public static void main(String[] args) {
        double result1 = Point.distance(3,4,5,6);
        System.out.println("result1 (3, 4) to (5, 6) " + result1);
    }
}
