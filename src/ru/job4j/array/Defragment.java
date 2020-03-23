package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; // указатель, на не null ячейку.

                while (array[index] == null) {
                    index++;

                    if (index == array.length) {
                        break;
                    }
                    if (array[index] != null) {
                        String temp = array[index];
                        array[index] = null;
                        array[point] = temp;
                        break;
                    }
                }
                index = point;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
