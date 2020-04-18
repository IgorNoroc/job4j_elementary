package ru.job4j.students;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentTest {
    @Test
    public void whenHave3() {
        List<Student> input = Arrays.asList(
                new Student("student4", 34),
                new Student("student6", 80),
                new Student("student1", 60),
                new Student("student43", 25),
                null,
                new Student("student3", 90),
                null,
                new Student("student3", 70),
                new Student("student5", 60)
        );
        List<Student> expected = Arrays.asList(
                new Student("student3", 90),
                new Student("student6", 80),
                new Student("student3", 70)
        );
        List<Student> result = new CollectStudents().levelOf(input, 69);
        assertThat(result, is(expected));
    }
}
