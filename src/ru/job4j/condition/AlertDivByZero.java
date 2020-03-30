package ru.job4j.condition;

/**
 * .1. Операторы ветвлений[#257413]
 */
public class AlertDivByZero {
    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-1);
    }

    /**
     * Проверяем не негативное ли или равное нулю число.
     *
     * @param number число.
     */
    private static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0");
        }
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
