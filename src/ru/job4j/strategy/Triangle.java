package ru.job4j.strategy;

/**
 * 7. Шаблон проектирования - Стратегия.[#257550]
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("     ^     ").append(System.lineSeparator())
                .append("    ^ ^    ").append(System.lineSeparator())
                .append("   ^   ^   ").append(System.lineSeparator())
                .append("  ^     ^  ").append(System.lineSeparator())
                .append(" ^       ^ ").append(System.lineSeparator())
                .append("^^^^^^^^^^^").append(System.lineSeparator());
        return sb.toString();
    }
}
