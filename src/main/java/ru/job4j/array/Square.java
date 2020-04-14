package ru.job4j.array;

/**
 * 6.0.4. Заполнить массив степенями чисел.[#257416]
 */
public class Square {
    /**
     * Собираем массив с значениями в квадрате.
     *
     * @param bound размер массива.
     * @return собранный массив.
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    /**
     * Выводим в консоль массив с значениями в квадрате, размером в четыре ячейки.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
