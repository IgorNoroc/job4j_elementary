package ru.job4j.search;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Igor", "Noroc", "221133", "Moscow")
        );
        ArrayList<Person> persons = phones.find("221133");
        assertThat(persons.get(0).getName(), is("Igor"));
    }
}
