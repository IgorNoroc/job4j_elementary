package ru.job4j.array;

/**
 * 6.2.3. Перевернуть массив.[#257434]
 */
public class Turn {
    /**
     * Разворачиваем массив.
     *
     * @param array массив.
     * @return обновленный массив.
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
            if (i >= (array.length - 1) / 2) {
                break;
            }
        }
        return array;
    }
}
