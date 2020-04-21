package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Группировка по интересам. [#106993]
 */
public class Group {
    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(student -> student.getUnits().stream()
                .map(s -> new Holder(s, student.getName())))
                .collect(
                        Collectors.groupingBy(Holder::getKey,
                                Collector.of(
                                        HashSet::new,
                                        (set, el) -> set.add(el.getValue()),
                                        (left, right) -> {
                                            left.addAll(right);
                                            return left;
                                        }
                                )
                        )
                );
    }
}
