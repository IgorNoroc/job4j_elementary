package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenAClass() {
        List<Student> input = List.of(
                new Student(54),
                new Student(30),
                new Student(90),
                new Student(75),
                new Student(60),
                new Student(99),
                new Student(80),
                new Student(35)
        );
        List<Student> expected = List.of(
                new Student(90),
                new Student(75),
                new Student(99),
                new Student(80)
        );
        List<Student> result = new School().collect(input, st -> st.getScore() >= 70 && st.getScore() <=100);
        assertThat(result, is(expected));
    }

    @Test
    public void whenBClass() {
        List<Student> input = List.of(
                new Student(54),
                new Student(30),
                new Student(90),
                new Student(75),
                new Student(60),
                new Student(99),
                new Student(80),
                new Student(35)
        );
        List<Student> expected = List.of(
                new Student(54),
                new Student(60)
        );
        List<Student> result = new School().collect(input, st -> st.getScore() >= 50 && st.getScore() < 70);
        assertThat(result, is(expected));
    }

    @Test
    public void whenCClass() {
        List<Student> input = List.of(
                new Student(54),
                new Student(30),
                new Student(90),
                new Student(75),
                new Student(60),
                new Student(99),
                new Student(80),
                new Student(35),
                new Student(49)
        );
        List<Student> expected = List.of(
                new Student(30),
                new Student(35),
                new Student(49)
        );
        List<Student> result = new School().collect(input, st -> st.getScore() >= 0 && st.getScore() < 50);
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectToMap() {
        List<Student> input = List.of(
                new Student("student1", 70),
                new Student("student3", 45),
                new Student("student2", 55),
                new Student("student5", 73)
        );
        Map<String, Student> expected = Map.of(
                "student1", new Student("student1", 70),
                "student3", new Student("student3", 45),
                "student2", new Student("student2", 55),
                "student5", new Student("student5", 73)
        );
        Map<String, Student> result = new School().collectToMap(input);
        assertThat(result, is(expected));
    }
}
