package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int moneyChange = money - price;
        int[] rsl = new int[100];
        int count = 0;
        for (int coin : coins) {
            while (moneyChange >= coin) {
                rsl[count++] = coin;
                moneyChange -= coin;
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
