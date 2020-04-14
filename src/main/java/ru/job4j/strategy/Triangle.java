package ru.job4j.strategy;

import java.util.StringJoiner;

/**
 * 7. Шаблон проектирования - Стратегия.[#257550]
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringJoiner sj = new StringJoiner(System.lineSeparator())
                .add("     ^     ")
                .add("    ^ ^    ")
                .add("   ^   ^   ")
                .add("  ^     ^  ")
                .add(" ^       ^ ")
                .add("^^^^^^^^^^^");
        return sj.toString();
    }
}
