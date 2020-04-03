package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenCreateItem() {
        String[] answers = {"Igor", "Tanea", "Olea"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        Item[] items = tracker.findAll();
        Item[] expected = {new  Item("Igor"), new Item("Tanea"), new Item("Olea")};
        assertThat(items[0].getName(), is(expected[0].getName()));
        assertThat(items[1].getName(), is(expected[1].getName()));
        assertThat(items[2].getName(), is(expected[2].getName()));
    }
}
