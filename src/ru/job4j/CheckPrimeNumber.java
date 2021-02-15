package ru.job4j;

public class CheckPrimeNumber {

    public static int calc(int finish) {

        int count = 0;
        for (int num = 1; num < finish; num++) {
            if (CheckPrimeNumber.check(num)) {
            } else if ((num % 5) == 0) {
                count++;
            }
        }

        return count;
    }

    private static boolean check(int num) {
        System.out.println(calc(5));
        System.out.println(calc(11));
        System.out.println(calc(2));
        return false;
    }


}
