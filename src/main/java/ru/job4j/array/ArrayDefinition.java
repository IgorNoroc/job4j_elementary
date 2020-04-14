package ru.job4j.array;

/**
 * 6.0.2. Заполнение массива.[#257431]
 */
public class ArrayDefinition {
    /**
     * Собираем массив слов и выводим в консоль.
     */
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Vasea Petrov";
        names[1] = "Ivan Ivanov";
        names[2] = "Lena Privetova";
        names[3] = "Anatolii Kaprizov";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
