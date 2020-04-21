package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RealizeFuncDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = RealizeFuncDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenSquareResults() {
        List<Double> result = RealizeFuncDiapason.diapason(3, 6, x -> 3 * x * x + 6 + 9);
        List<Double> expected = Arrays.asList(42D, 63D, 90D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenShowFunction() {
        List<Double> result = RealizeFuncDiapason.diapason(5, 8, x -> Math.pow(x, 3));
        List<Double> expected = Arrays.asList(125D, 216D, 343D);
        assertThat(result, is(expected));
    }
}
