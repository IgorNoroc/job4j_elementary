package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean result = left > right;
        return result ? left : right;
    }

    public static int max(int first, int second, int third) {
        boolean result = first > max(second, third);
        return result ? first : max(second, third);
    }

    public static int max(int first, int second, int third, int four) {
        boolean result = first > max(second, third, four);
        return result ? first : max(second, third, four);
    }
}


