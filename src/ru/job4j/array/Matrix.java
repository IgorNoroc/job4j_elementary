package ru.job4j.array;


/**
 * 6.6.2. Двухмерный массив. Таблица умножения.[#257418]
 */
public class Matrix {
    /**
     * Создаем таблицу умножения.
     *
     * @param size размер.
     * @return двухмерный массив.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
