package ru.job4j;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 0; i < number; i++) {
            if ((number % i )== 0) {
                prime = false;
                break;
            }

        }

        return prime;


    }
}
