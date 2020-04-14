package ru.job4j.array;

/**
 * 6.5. Поиск индекса в диапазоне.[#257424]
 */
public class FindLoop {
    /**
     * Находим нужный индекс в массиве по значению.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Находим нужный индекс в массиве по значению в заданном диапазоне.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i < finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
