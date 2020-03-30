package ru.job4j.array;

/**
 * 6.5.1. Поиск минимального числа в массиве.[#257426].
 */
public class Min {
    /**
     * Ищем минимальное значение в массиве.
     *
     * @param array массив.
     * @return минимальне число.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
