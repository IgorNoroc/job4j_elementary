package ru.job4j.calculator;

/**
 * 4.1. Результат работы метода.[#257452]
 */
public class MathFunc {
    /**
     * Заданное число в квадрате плюс единичка.
     *
     * @param x число.
     * @return
     */
    public static int func1(int x) {
        return x * x + 1;
    }

    /**
     * Операция умножения.
     *
     * @param x число.
     * @return число умноженное на 10.
     */
    public static int func2(int x) {
        return x * 10;
    }

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func1(5);
        int total = result1 + result2;
        System.out.println(total);
    }
}
