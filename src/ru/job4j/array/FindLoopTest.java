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


    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind7() {
        int[] input = new int[]{3, 5, 54, 6, 2, 4, 7, 4, 2, 5, 2, 64};
        int value = 4;
        int start = 6;
        int finish = 10;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expected = 7;
        assertThat(result, is(expected));
    }

    @Test
    public void whenNotFind() {
        int[] input = new int[]{3, 5, 54, 6, 2, 4, 7, 4, 2, 5, 2, 12};
        int value = 12;
        int start = 1;
        int finish = 9;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expected = -1;
        assertThat(result, is(expected));
    }
}
