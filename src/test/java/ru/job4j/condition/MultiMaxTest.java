package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax multiMax = new MultiMax();
        int result = multiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        MultiMax multiMax = new MultiMax();
        int result = multiMax.max(23, 3, 3);
        assertThat(result, is(23));
    }

    @Test
    public void whenThirdMax() {
        MultiMax multiMax = new MultiMax();
        int result = multiMax.max(2, 4, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenAllNumbersIsMax() {
        MultiMax multiMax = new MultiMax();
        int result = multiMax.max(4, 4, 4);
        assertThat(result, is(4));
    }
}
