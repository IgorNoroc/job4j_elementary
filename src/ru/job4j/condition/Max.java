package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean result = left > right;
        return result ? left : right;
    }
}


