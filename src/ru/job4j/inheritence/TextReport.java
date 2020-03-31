package ru.job4j.inheritence;

/**
 * 4. Переопределение[#257584]
 */
public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
