package ru.job4j.search;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        var result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenSizeIsZero() {
        var queue = new PriorityQueue();
        queue.put(new Task("one", 1));
        var result = queue.take();
        assertThat(result.getDesc(), is("one"));
    }

    @Test
    public void whenUrgentIsLast() {
        var queue = new PriorityQueue();
        queue.put(new Task("low1", 5));
        queue.put(new Task("low2", 5));
        queue.put(new Task("low3", 5));
        queue.put(new Task("low4", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("urgen", 1));
        queue.put(new Task("low5", 5));
        var result = queue.take();
        assertThat(result.getDesc(), is("urgen"));
        var rsl = queue.take();
        assertThat(rsl.getDesc(), is("urgent"));
    }
}
