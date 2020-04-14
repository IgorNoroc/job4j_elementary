package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2. Комбинированный компаратор.[#257513]
 */
public class JobSortOrderByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
