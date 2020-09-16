package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int sum =  money - price;

        for (int index = 0; sum > 0; index ++) {
            while (sum >= COINS[index]) {
                sum = sum - COINS[index];
                rsl[size] = COINS[index];
                size = size + 1;
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
