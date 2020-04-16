package ru.job4j.colection;

import org.junit.Test;
import ru.job4j.collection.LexSort;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sort3Num() {
        String[] input = {
                "1.2 Task.",
                "0.1 Task.",
                "1.4 Task."
        };
        String[] out = {
                "0.1 Task.",
                "1.2 Task.",
                "1.4 Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}
