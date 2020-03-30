package ru.job4j.array;

/**
 * 6.4.1. Слово заканчивается на ...[#257423]
 */
public class EndsWith {
    /**
     * Проверяем заканичивается ли слово на...
     *
     * @param word заданное слово.
     * @param post окончание.
     * @return
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int count = word.length - 1;
        for (int i = post.length - 1; i >= 0; i--) {
            if (word[count] != post[i]) {
                result = false;
                break;
            }
            count--;
        }
        return result;
    }
}
