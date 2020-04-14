package ru.job4j.array;

/**
 * 6.2. Упорядочить массив.[#257440]
 */
public class AlgoArray {
    /**
     * Сортрируем массив по возрастанию.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int tp = array[j];
                    array[j] = array[i];
                    array[i] = tp;
                }
            }
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
