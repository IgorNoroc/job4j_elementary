package ru.job4j.collection;

/**
 * 1. Уникальные задачи.[#257529]
 */
public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
