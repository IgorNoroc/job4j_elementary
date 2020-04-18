package ru.job4j.colection;

import org.junit.Test;
import ru.job4j.collection.Departments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1/sk1", "k1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1/sk1", "k1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAsc() {
        List<String> input = Arrays.asList(
                "K1/SK1",
                "K2/SK1/SSK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1",
                "K2",
                "K2/SK1/SSK2"
        );
        List<String> expected = Arrays.asList(
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        Departments.sortAsc(input);
        assertThat(input, is(expected));
    }

    @Test
    public void whenHave3Missed() {
        List<String> input = Arrays.asList(
                "k2/dep1",
                "k3/dep1",
                "k2/dep1/dep2",
                "k1/dep1"
        );
        List<String> expected = Arrays.asList(
                "k1",
                "k1/dep1",
                "k2",
                "k2/dep1",
                "k3",
                "k2/dep1/dep2",
                "k3/dep1"
        );
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortReverse() {
        List<String> input = Arrays.asList(
                "K1/SK1",
                "K2/SK1/SSK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1",
                "K2",
                "K2/SK1/SSK2"
        );
        List<String> expected = Arrays.asList(
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2"
                );
        Departments.sortDesc(input);
        assertThat(input, is(expected));
    }
}
