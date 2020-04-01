package ru.job4j.condition;

/**
 * 3. Перегрузить метод max для трех чисел[#257570]
 */
public class Max {
    /**
     * Находим максимум из двух чисел.
     *
     * @param left  первое число.
     * @param right второе число.
     * @return максимальное число.
     */
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    /**
     * Находим максимум из трёх чисел.
     *
     * @param first  первое число.
     * @param second второе число.
     * @param third  третье число.
     * @return максимальное число.
     */
    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    /**
     * Находим максимум из четырёх чисел.
     *
     * @param first  первое число.
     * @param second второе число.
     * @param third  третье число.
     * @param four   четвертое число.
     * @return максимальное число.
     */
    public static int max(int first, int second, int third, int four) {
        return max(first, max(second, max(third, four)));
    }
}


