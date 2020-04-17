package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 1. Телефонный справочник на базе ArrayList[#257516]
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * 6. Функции высшего порядка[#257374]
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = person -> person.getName().contains(key)
                || person.getSurname().contains(key)
                || person.getPhone().contains(key)
                || person.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
