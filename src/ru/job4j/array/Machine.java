package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int moneyChange = money - price;
        int[] rsl = new int[100];
        int count = 0;

        while (moneyChange > 0) {
            for (int coin : coins) {
                if (moneyChange >= coin) {
                    rsl[count++] = coin;
                    moneyChange -= coin;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
