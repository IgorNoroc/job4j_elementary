package ru.job4j.strategy;

/**
 * 7. Шаблон проектирования - Стратегия.[#257550]
 */
public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("XXXXXXXXX").append(System.lineSeparator())
                .append("X       X").append(System.lineSeparator())
                .append("X       X").append(System.lineSeparator())
                .append("XXXXXXXXX").append(System.lineSeparator());
        return sb.toString();
    }
}
