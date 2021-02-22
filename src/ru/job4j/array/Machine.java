package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int delta = money - price;
        while (delta > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (delta >= coins[i]) {
                    rsl[i] = coins[i];
                    delta = delta - coins[i];
                    size++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
