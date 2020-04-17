package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenAClass() {
        List<Student> input = Arrays.asList(
                new Student(54),
                new Student(30),
                new Student(90),
                new Student(75),
                new Student(60),
                new Student(99),
                new Student(80),
                new Student(35)
        );
        List<Student> expected = Arrays.asList(
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
        List<Student> input = Arrays.asList(
                new Student(54),
                new Student(30),
                new Student(90),
                new Student(75),
                new Student(60),
                new Student(99),
                new Student(80),
                new Student(35)
        );
        List<Student> expected = Arrays.asList(
                new Student(54),
                new Student(60)
        );
        List<Student> result = new School().collect(input, st -> st.getScore() >= 50 && st.getScore() < 70);
        assertThat(result, is(expected));
    }

    @Test
    public void whenCClass() {
        List<Student> input = Arrays.asList(
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
        List<Student> expected = Arrays.asList(
                new Student(30),
                new Student(35),
                new Student(49)
        );
        List<Student> result = new School().collect(input, st -> st.getScore() >= 0 && st.getScore() < 50);
        assertThat(result, is(expected));
    }
}
