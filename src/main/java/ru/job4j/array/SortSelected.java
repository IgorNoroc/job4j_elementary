package ru.job4j.array;

/**
 * 6.5.3. Сортировка выборкой.[#257425].
 */
public class SortSelected {
    /**
     * Сортируем массив по возрастанию.
     *
     * @param data массив.
     * @return отсорированный массив.
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            if (data[index] < data[i]) {
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }
}
