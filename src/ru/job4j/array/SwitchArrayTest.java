package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to3() {
        int[] input = {1, 2, 8, 4, 9};
        int[] expect = {1, 4, 8, 2, 9};
        int[] rsl = SwitchArray.swap(input, 1, 3);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to6() {
        int[] input = {10, 21, 8, 5, 8, 9, 4, 30};
        int[] expect = {10, 4, 8, 5, 8, 9, 21, 30};
        int[] rsl = SwitchArray.swap(input, 1, 6);
        assertThat(rsl, is(expect));
    }
}
