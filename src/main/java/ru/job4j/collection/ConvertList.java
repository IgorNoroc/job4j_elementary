package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Конвертация листа массивов в один лист Integer[#257520]
 */
public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            for (int num : row) {
                rsl.add(num);
            }
        }
        return rsl;
    }
}
