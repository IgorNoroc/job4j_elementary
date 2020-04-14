package ru.job4j.loop;

/**
 * 5.2. Создать программу, вычисляющую факториал.[#257491]
 */
public class Factorial {
    /**
     * Факториал числа.
     *
     * @param n число.
     * @return
     */
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
