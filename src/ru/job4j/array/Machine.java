package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int moneyChange = money - price;
        int[] rsl = new int[0];

        for (int i = 0; i < coins.length; i++) {
            if (moneyChange >= coins[i]) {
                rsl = Arrays.copyOf(rsl, rsl.length + 1);
                rsl[rsl.length - 1] = coins[i];
                moneyChange -= coins[i];
                i--;
            }
        }
        return rsl;
    }
}
