package ru.job4j.array;

/**
 * 6.5.2. Поиск минимума в диапазоне.[#257427].
 */
public class MinDiapason {
    /**
     * Ищем минимальное число в массиве в заданом диапазоне.
     *
     * @param array  массив.
     * @param start  началый индекс.
     * @param finish конечный индекс.
     * @return минимальное число, если существует.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
