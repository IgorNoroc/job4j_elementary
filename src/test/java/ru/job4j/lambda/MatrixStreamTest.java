package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixStreamTest {
    @Test
    public void whenHave3on3Matrix() {
        Integer[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expected = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );
        List<Integer> result = new MatrixStream().collect(input);
        assertThat(result, is(expected));
    }
}
