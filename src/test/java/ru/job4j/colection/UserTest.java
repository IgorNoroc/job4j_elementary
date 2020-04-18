package ru.job4j.colection;

import org.junit.Test;
import ru.job4j.collection.User;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>(
                List.of(
                        new User("Petr", 32),
                        new User("Ivan", 31)
                )
        );
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void when5Users() {
        Set<User> users = new TreeSet<>(
                List.of(
                        new User("Petr", 32),
                        new User("user5", 33),
                        new User("user1", 32),
                        new User("Ivan", 31),
                        new User("user1", 31)
                )
        );
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
        assertThat(it.next(), is(new User("user1", 31)));
        assertThat(it.next(), is(new User("user1", 32)));
        assertThat(it.next(), is(new User("user5", 33)));
    }
}
