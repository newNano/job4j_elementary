package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int countDivider = 0;
        int countDividersPrimeNumber = 2;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                countDivider++;
            }
        }

        if (countDivider > countDividersPrimeNumber || number <= 1) {
            return false;
        } else {
            return true;
        }
    }
}
