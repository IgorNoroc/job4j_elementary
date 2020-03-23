package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {5, 4, 3, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3Numbers() {
        int[] input = new int[] {51, 41, 31};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {31, 41, 51};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5Numbers() {
        int[] input = new int[] {50, 1, 52, 21, 14};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 14, 21, 50, 52};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort9Numbers() {
        int[] input = new int[] {501, 102, 520, 21, 14, 23, 65, -1, -32};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-32, -1, 14, 21, 23, 65, 102, 501, 520};
        assertThat(result, is(expect));
    }
}
