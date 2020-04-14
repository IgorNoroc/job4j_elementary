package ru.job4j.sort;

import java.util.Arrays;

/**
 * 1. Экзамен. Базовый синтаксис.[#257478]
 */
public class Merge {
    /**
     * Main.
     * Соединение двух массивов  в один в выводом в консоль.
     *
     * @param args
     */
    public static void main(String[] args) {
        Merge merge = new Merge();
        int[] result = merge.merge(
                new int[]{9, 31, 32, 35, 100, 233, 1233, 6000},
                new int[]{5, 5, 12, 4000}
        );
        System.out.println(Arrays.toString(result));
    }

    /**
     * Обьединение двух отсортированых массивов в один в возрастающем порядке.
     *
     * @param left  первый массыв.
     * @param right второй массив.
     * @return объедененый массив.
     */
    public int[] merge(int[] left, int[] right) {
        int countL = 0;
        int countR = 0;
        int countOfResult = 0;
        int[] result = new int[left.length + right.length];
        while (countOfResult < result.length) {
            if (countL < left.length && countR < right.length) {
                result[countOfResult++] = left[countL] < right[countR] ? left[countL++] : right[countR++];
            } else if (countL == left.length && countR < right.length) {
                result[countOfResult++] = right[countR++];
            } else if (countR == right.length && countL < left.length) {
                result[countOfResult++] = left[countL++];
            }
        }
        return result;
    }
}
