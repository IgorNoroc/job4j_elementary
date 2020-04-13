package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2. Комбинированный компаратор.[#257513]
 */
public class JobSortReverseByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
