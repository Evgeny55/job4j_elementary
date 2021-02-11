package ru.job4j.Loop;

public class Board {
    public static void paint(int width, int height) {
        //width ширина, height высота
        for (int row = 0; row < width; row++) {
            for (int cell = 0; cell < height; cell++) {
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("X");
                }
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
