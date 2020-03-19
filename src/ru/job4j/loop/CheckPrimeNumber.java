package ru.job4j.loop;

public class CheckPrimeNumber {
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
