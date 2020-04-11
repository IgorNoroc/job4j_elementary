package ru.job4j.colection;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.collection.ConvertList2Array;

import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class ConverterList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when21ElementsThen24() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 23, 5, 23, 3, 2, 4, 1, 1, 1, 2, 2, 2, 3, 3),
                6
        );
        int[][] expect = {
                {1, 2, 3, 4, 5, 6},
                {7, 23, 5, 23, 3, 2},
                {4, 1, 1, 1, 2, 2},
                {2, 3, 3, 0, 0, 0}
        };
        assertThat(result, is(expect));
    }
}
