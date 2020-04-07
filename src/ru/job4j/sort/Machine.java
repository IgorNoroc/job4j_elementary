package ru.job4j.sort;

import java.util.Arrays;

/**
 * Сдача в кофе машине. [#34741]
 */
public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    /**
     * Сдача в кофе мошине.
     *
     * @param money кол-во вставленных денег.
     * @param price стоимость товора.
     * @return сдача.
     */
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int count = money - price;
        for (int coin : coins) {
            while (count >= coin) {
                count -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
