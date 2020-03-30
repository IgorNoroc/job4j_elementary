package ru.job4j.condition;

/**
 * 4.4. Максимум из трех чисел[#257412]
 */
public class MultiMax {
    /**
     * Находим максимум из трёх чисел.
     *
     * @param first  первое число.
     * @param second второе число.
     * @param third  третье число.
     * @return максимальное число.
     */
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return result > third ? result : third;
    }
}
