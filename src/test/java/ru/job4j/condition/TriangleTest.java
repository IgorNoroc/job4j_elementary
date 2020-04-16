package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenArea() {
        Point first = new Point(2, 2);
        Point second = new Point(1, 1);
        Point third = new Point(1, 3);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        double expected = 0.64;
        assertEquals(expected, result, 0.01);
    }
}
