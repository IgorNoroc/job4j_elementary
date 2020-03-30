package ru.job4j.loop;

/**
 * 5.6. Простые числа.[#257484]
 */
public class PrimeNumber {
    /**
     * Количество простых чисел до указаного числа.
     *
     * @param finish диапазон чисел.
     * @return кол-во чисел.
     */
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
