package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 5. Преобразование матрицы чисел в список чисел.[#257391]
 */
public class MatrixStream {
    public List<Integer> collect(Integer[][] numbers) {
        return  Stream.of(numbers).
                flatMap(Stream::of).
                collect(Collectors.toList());
    }
}
