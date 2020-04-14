package ru.job4j.array;

/**
 * 6.3. Массив заполнен true или false[#257420]
 */
public class Check {
    /**
     * Проверяем заполнен ли весь массив одинаковыми значениями.
     *
     * @param data массив.
     * @return истина или ложь.
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
