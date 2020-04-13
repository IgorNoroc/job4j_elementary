package ru.job4j.collection;

import java.util.Comparator;

/**
 * 3. Компаратор для строк[#257510]
 */
public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        char[] first = o1.toCharArray();
        char[] second = o2.toCharArray();
        int length = Math.min(first.length, second.length);
        for (int i = 0; i < length; i++) {
            int temp = Character.compare(first[i], second[i]);
            if (temp != 0) {
                rsl = temp;
                break;
            }
        }
        if (rsl == 0 && first.length != second.length) {
            rsl = first.length - second.length;
        }
        return rsl;
    }
}
