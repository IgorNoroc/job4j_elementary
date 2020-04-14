package ru.job4j.inheritence;

/**
 * 4. Переопределение[#257584]
 */
public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "name : " + name + "," + System.lineSeparator() + "body : " + body;
    }
}
