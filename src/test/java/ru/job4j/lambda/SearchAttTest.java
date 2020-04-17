package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SearchAttTest {
    @Test
    public void whenLookingForKey() {
        List<Attachment> input = Arrays.asList(
                new Attachment("user1", 10),
                new Attachment("user2", 12),
                new Attachment("user1", 15),
                new Attachment("user1", 30),
                new Attachment("user2", 43)
        );
        List<Attachment> expected = Arrays.asList(
                new Attachment("user2", 12),
                new Attachment("user2", 43)
        );
        assertThat(SearchAtt.filter(input, "user2"), is(expected));
    }

    @Test
    public void whenLookingForSizeGrater20() {
        List<Attachment> input = Arrays.asList(
                new Attachment("user1", 10),
                new Attachment("user2", 12),
                new Attachment("user1", 15),
                new Attachment("user1", 30),
                new Attachment("user2", 43)
        );
        List<Attachment> expected = Arrays.asList(
                new Attachment("user1", 30),
                new Attachment("user2", 43)
        );
        assertThat(SearchAtt.filter(input, 20), is(expected));
    }
}
