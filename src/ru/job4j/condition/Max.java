package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean result = left > right;
        return result ? left : right;
    }

    public static int add(int first, int second) {
        return first + second;
    }

    public static int add(int first, int second, int third) {
        return add(
                first,
                add(second, third));
    }

    public static int add(int first, int second, int third, int four) {
        return add(
                first,
                add(second, third, four));
    }
}


