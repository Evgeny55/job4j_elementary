package ru.job4j.Loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 1; i < number; i++) {
        } if ((number % 5) == 0) {
            prime = false;
        }
        return prime;
    }


    public static void main (String[]args){
        System.out.println(check(5));
        System.out.println(check(4));
        System.out.println(check(1));
    }
}
