package ru.job4j.loop;

/**
 * 5.0.1. Сумма чисел.[#257488]
 */
public class Counter {
    /**
     * Сумма всех чисел в диапазоне.
     *
     * @param start  старт диапазона.
     * @param finish финишь диаразона.
     * @return сумма.
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Сумма всех четных чисел в диапазоне.
     *
     * @param start начало диапазона.
     * @param finis финишь диапазона.
     * @return сумма.
     */
    public static int sumByEven(int start, int finis) {
        int sum = 0;
        for (int i = start; i <= finis; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
