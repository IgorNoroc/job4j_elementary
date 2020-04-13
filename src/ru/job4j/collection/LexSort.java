package ru.job4j.collection;

import java.util.Comparator;

/**
 * 4. Сортировка номера[#257511]
 */
public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] first = o1.split(" ");
        String[] second = o2.split(" ");
        int left = Integer.parseInt(first[0].replace(".", ""));
        int right = Integer.parseInt(second[0].replace(".", ""));
        return Integer.compare(left, right);
    }
}
