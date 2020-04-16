package ru.job4j.search;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenSizeIsZero() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("one", 1));
        Task result = queue.take();
        assertThat(result.getDesc(), is("one"));
    }

    @Test
    public void whenUrgentIsLast() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low1", 5));
        queue.put(new Task("low2", 5));
        queue.put(new Task("low3", 5));
        queue.put(new Task("low4", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("urgen", 1));
        queue.put(new Task("low5", 5));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgen"));
        Task rsl = queue.take();
        assertThat(rsl.getDesc(), is("urgent"));
    }
}
