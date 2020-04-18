package ru.job4j.colection;

import org.junit.Test;
import ru.job4j.collection.ConvertList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>(
                List.of(
                new int[] {1},
                new int[] {2, 3}
        ));
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }

    @Test
    public void when3List() {
        List<int[]> in = new ArrayList<>(
                List.of(
                        new int[] {1, 2},
                        new int[] {4, 3, 5},
                        new int[] {12, 13, 14}
        ));
        List<Integer> expect = Arrays.asList(1, 2, 4, 3, 5, 12, 13, 14);
        assertThat(ConvertList.convert(in), is(expect));
    }
}
