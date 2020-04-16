package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 180;
        double out = 92.0;
        double expected = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 160;
        double out = 57.49;
        double expected = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
