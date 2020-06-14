package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Проверить две строчки на идентичность.
 */
public class FreezeStr {
    public static boolean eq(String left, String right)  {
        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();
        char[] a = left.toCharArray();
        char[] b = right.toCharArray();
        put(left, first, a);
        put(right, second, b);
        return Objects.equals(first, second);
    }

    private static void put(String word, Map<Character, Integer> map, char[] a) {
        for (int i = 0; i < word.length(); i++) {
            if (map.containsKey(a[i])) {
                int temp = map.get(a[i]);
                map.replace(a[i], temp + 1);
            } else {
                map.put(a[i], 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(eq("Privet", "rPivet"));
    }
}
