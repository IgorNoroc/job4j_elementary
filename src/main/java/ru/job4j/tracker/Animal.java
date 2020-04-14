package ru.job4j.tracker;

/**
 * 2. Перегрузка конструктора.[#257583]
 */
public class Animal {
    private String name;

    public Animal() {
        super();
        System.out.println("class Animal");
    }

    public Animal(String name) {
        this.name = name;
    }
}
