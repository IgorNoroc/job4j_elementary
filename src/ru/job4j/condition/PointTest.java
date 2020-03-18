package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int in1 = 1;
        int in2 = 4;
        int in3 = 5;
        int in4 = 2;
        double out = 4.47;
        double expected = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}
