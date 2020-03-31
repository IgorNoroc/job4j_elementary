package ru.job4j.tracker;

/**
 * 2. Перегрузка конструктора.[#257583]
 */
public class Predator extends Animal {
    private String name;

    public Predator() {
        super();
        System.out.println("class Predator");
    }

    public Predator(String name) {
        this.name = name;
    }
}
