package ru.job4j.ex;

import java.util.Arrays;

/**
 * 0. Что такое исключение.[#257563]
 */
public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index <= middle; index++) {
            String temp = names[index];
            names[index] = names[index + 1];
            names[index + 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
