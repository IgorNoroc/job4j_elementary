package ru.job4j.collection;

import java.util.Arrays;

/**
 * Проверить две строчки на идентичность.
 */
public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] first = left.toCharArray();
        char[] second = right.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}
