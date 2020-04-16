package ru.job4j.colection;

import org.junit.Test;
import ru.job4j.collection.*;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenOrderSortByName() {
        List<Job> list = new ArrayList<>(
                Arrays.asList(
                        new Job("user1", 4),
                        new Job("user2", 2),
                        new Job("user1", 6),
                        new Job("user2", 1),
                        new Job("user3", 4)
                )
        );
        list.sort(new JobSortOrderByName());
        List<Job> rsl = new ArrayList<>(
                Arrays.asList(
                        new Job("user1", 4),
                        new Job("user1", 6),
                        new Job("user2", 2),
                        new Job("user2", 1),
                        new Job("user3", 4)
                )
        );
        assertThat(list, is(rsl));
    }

    @Test
    public void whenSortReverseName() {
        List<Job> list = new ArrayList<>(
                Arrays.asList(
                        new Job("user1", 4),
                        new Job("user2", 2),
                        new Job("user1", 6),
                        new Job("user2", 1),
                        new Job("user3", 4)
                )
        );
        list.sort(new JobSortReverseByName());
        List<Job> rsl = new ArrayList<>(
                Arrays.asList(
                        new Job("user3", 4),
                        new Job("user2", 2),
                        new Job("user2", 1),
                        new Job("user1", 4),
                        new Job("user1", 6)
                )
        );
        assertThat(list, is(rsl));
    }

    @Test
    public void whenSortOrByPriority() {
        List<Job> list = new ArrayList<>(
                Arrays.asList(
                        new Job("user1", 4),
                        new Job("user2", 2),
                        new Job("user1", 6),
                        new Job("user2", 1),
                        new Job("user3", 4)
                )
        );
        list.sort(new JobSortOrderByPriority());
        List<Job> rsl = new ArrayList<>(
                Arrays.asList(
                        new Job("user2", 1),
                        new Job("user2", 2),
                        new Job("user1", 4),
                        new Job("user3", 4),
                        new Job("user1", 6)
                )
        );
        assertThat(list, is(rsl));
    }

    @Test
    public void whenSortReverseByPriority() {
        List<Job> list = new ArrayList<>(
                Arrays.asList(
                        new Job("user1", 4),
                        new Job("user2", 2),
                        new Job("user1", 6),
                        new Job("user2", 1),
                        new Job("user3", 4)
                )
        );
        list.sort(new JobSortReverseByPriority());
        List<Job> rsl = new ArrayList<>(
                Arrays.asList(
                        new Job("user1", 6),
                        new Job("user1", 4),
                        new Job("user3", 4),
                        new Job("user2", 2),
                        new Job("user2", 1)
                )
        );
        assertThat(list, is(rsl));
    }

    @Test
    public void whenSortOrByNameThenSortRevByPriority() {
        List<Job> list = new ArrayList<>(
                Arrays.asList(
                        new Job("user1", 4),
                        new Job("user2", 2),
                        new Job("user1", 6),
                        new Job("user2", 1),
                        new Job("user3", 4)
                )
        );
        list.sort(new JobSortOrderByName().thenComparing(new JobSortReverseByPriority()));
        List<Job> rsl = new ArrayList<>(
                Arrays.asList(
                        new Job("user1", 6),
                        new Job("user1", 4),
                        new Job("user2", 2),
                        new Job("user2", 1),
                        new Job("user3", 4)
                )
        );
        assertThat(list, is(rsl));
    }

    @Test
    public void whenSortOrdPriorityThenSortRevByName() {
        List<Job> list = new ArrayList<>(
                Arrays.asList(
                        new Job("user1", 4),
                        new Job("user2", 2),
                        new Job("user1", 6),
                        new Job("user2", 1),
                        new Job("user3", 4)
                )
        );
        list.sort(new JobSortOrderByPriority().thenComparing(new JobSortReverseByName()));
        List<Job> rsl = new ArrayList<>(
                Arrays.asList(
                        new Job("user2", 1),
                        new Job("user2", 2),
                        new Job("user3", 4),
                        new Job("user1", 4),
                        new Job("user1", 6)
                )
        );
        assertThat(list, is(rsl));
    }
}
