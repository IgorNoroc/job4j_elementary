package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SearchAttTest {
    @Test
    public void whenLookingForKey() {
        List<Attachment> input = List.of(
                new Attachment("user1", 10),
                new Attachment("user2", 12),
                new Attachment("user1", 15),
                new Attachment("user1", 30),
                new Attachment("user2", 43)
        );
        List<Attachment> expected = List.of(
                new Attachment("user2", 12),
                new Attachment("user2", 43)
        );
        List<Attachment> result = SearchAtt.filter(input, att -> att.getName().equals("user2"));
        assertThat(result, is(expected));
    }

    @Test
    public void whenLookingForSizeGrater20() {
        List<Attachment> input = List.of(
                new Attachment("user1", 10),
                new Attachment("user2", 12),
                new Attachment("user1", 15),
                new Attachment("user1", 30),
                new Attachment("user2", 43)
        );
        List<Attachment> expected = List.of(
                new Attachment("user1", 30),
                new Attachment("user2", 43)
        );
        List<Attachment> result = SearchAtt.filter(input, att -> att.getSize() > 20);
        assertThat(result, is(expected));
    }
}
