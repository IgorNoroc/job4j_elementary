package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 2.0. Встроенные функциональные интерфейсы.[#257381]
 */
public class SearchAtt {
    /**
     * Получаем нужный список по ключу.
     *
     * @param list весь список.
     * @param key  ключ.
     * @return список с нужными объектами.
     */
    public static List<Attachment> filter(List<Attachment> list, String key) {
        Predicate<String> predicate = s -> s.equals(key);
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (predicate.test(att.getName())) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    /**
     * Получаем нужный список что больше размера.
     *
     * @param list весь список.
     * @param size  размер.
     * @return список с нужными объектами.
     */
    public static List<Attachment> filter(List<Attachment> list, int size) {
        Predicate<Integer> predicate = x -> x > size;
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (predicate.test(att.getSize())) {
                rsl.add(att);
            }
        }
        return rsl;
    }
}

