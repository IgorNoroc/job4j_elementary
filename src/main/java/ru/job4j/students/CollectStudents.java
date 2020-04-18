package ru.job4j.students;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 0. Stream API улучшения[#257394]
 */
public class CollectStudents {
    /**
     * Вибор студентов с нужным баллом .
     * @param students список студентов.
     * @param bound указатель.
     * @return список студентов с балом выше указателя.
     */
    public List<Student> levelOf(List<Student> students, int bound) {
        Comparator<Student> compByScope = ((o1, o2) -> o2.getScope() - o1.getScope());
        return students.stream().flatMap(Stream::ofNullable)
                .sorted(compByScope)
                .takeWhile(st -> st.getScope() > bound)
                .collect(Collectors.toList());
    }
}
