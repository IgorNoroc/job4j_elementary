package ru.job4j.colection;

import org.junit.Test;
import ru.job4j.collection.Account;
import ru.job4j.collection.NotifyAccount;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotifyAccountTest {
    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void when3Eq() {
        List<Account> accounts = List.of(
                new Account("123", "Igor", "11100k"),
                new Account("123", "Igor", "11100k"),
                new Account("123", "Igor", "11100k")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("123", "Igor", "11100k")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}
