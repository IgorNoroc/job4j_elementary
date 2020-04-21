package ru.job4j.lambda;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {
    @Test
    public void whenHave5StAnd4Units() {
        List<Student> input = List.of(
                new Student("Igor", Set.of("unit1", "unit2", "unit3")),
                new Student("Tanea", Set.of("unit3")),
                new Student("Tolea", Set.of("unit3", "unit2", "unit4")),
                new Student("Olea", Set.of("unit1", "unit2")),
                new Student("Ivan", Set.of("unit3", "unit1"))
        );
        Map<String, Set<String>> expected = Map.of(
                "unit1", Set.of("Olea", "Igor", "Ivan"),
                "unit3", Set.of("Igor", "Tanea", "Tolea", "Ivan"),
                "unit4", Set.of("Tolea"),
                "unit2", Set.of("Igor", "Tolea", "Olea")
        );
        Map<String, Set<String>> result = Group.sections(input);
        assertThat(result, is(expected));
    }
}
