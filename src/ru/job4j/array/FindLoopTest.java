package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas10then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{4, 140, 34, 10};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas9thenAbsent() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{3, 4, 6, 6, 2, 6};
        int value = 9;
        int result = find.indexOf(input, value);
        int expected = -1;
        assertThat(result, is(expected));
    }
}
