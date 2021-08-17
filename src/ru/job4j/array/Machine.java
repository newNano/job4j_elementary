package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int moneyChange = money - price;
        int[] rsl = new int[0];

        while (moneyChange > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (moneyChange >= coins[i]) {
                    int[] tempArray = new int[rsl.length + 1];
                    for (int j = 0; j < rsl.length; j++) {
                        tempArray[j] = rsl[j];
                    }
                    tempArray[tempArray.length - 1] = coins[i];
                    rsl = tempArray;
                    moneyChange -= coins[i];
                    break;
                }
            }
        }
        return rsl;
    }
}
