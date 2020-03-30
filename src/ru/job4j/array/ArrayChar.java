package ru.job4j.array;

/**
 * 6.4. Слово начинается с ...[#257419]
 */
public class ArrayChar {
    /**
     * Проверяем начинается ли слово на...
     *
     * @param word заданное слово.
     * @param pref префикс.
     * @return истина или ложь.
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
