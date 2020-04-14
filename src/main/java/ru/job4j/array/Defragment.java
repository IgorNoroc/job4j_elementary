package ru.job4j.array;


/**
 * 6.8. Дефрагментация массива.[#257438].
 */
public class Defragment {
    /**
     * Перемещяем все пустые ячейки в конец массива.
     *
     * @param array массив.
     * @return обновленный массив.
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (array[point] == null && point < array.length - 1) {
                    point++;
                    if (array[point] != null) {
                        String temp = array[point];
                        array[point] = null;
                        array[index] = temp;
                        break;
                    }
                }
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
