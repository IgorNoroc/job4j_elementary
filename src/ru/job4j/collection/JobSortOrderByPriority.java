package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2. Комбинированный компаратор.[#257513]
 */
public class JobSortOrderByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
