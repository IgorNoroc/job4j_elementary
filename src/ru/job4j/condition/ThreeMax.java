package ru.job4j.condition;

public class ThreeMax {
    /**
     * Максимальное число используя укороченые операторы условия.
     *
     * @param first  первое число.
     * @param second второе число.
     * @param third  третье число.
     * @return максимум.
     */
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first > third) {
            result = first;
        }
        if (second >= first && second > third) {
            result = second;
        }
        return result;
    }
}
