package ru.job4j.loop;

/**
 * 5.5. Простое число.[#257486]
 */
public class CheckPrimeNumber {
    /**
     * Является ли число простым. 
     * @param number
     * @return
     */
    public static boolean check(int number) {
        boolean canDiv = true;
        if (number == 1) {
            canDiv = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                canDiv = false;
                break;
            }
        }
        return canDiv;
    }
}
