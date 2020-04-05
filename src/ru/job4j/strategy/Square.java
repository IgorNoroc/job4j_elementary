package ru.job4j.strategy;

import java.util.StringJoiner;

/**
 * 7. Шаблон проектирования - Стратегия.[#257550]
 */
public class Square implements Shape {
    @Override
    public String draw() {
        StringJoiner sj = new StringJoiner(System.lineSeparator())
                .add("XXXXXXXXX")
                .add("X       X")
                .add("X       X")
                .add("XXXXXXXXX");
        return sj.toString();
    }
}
