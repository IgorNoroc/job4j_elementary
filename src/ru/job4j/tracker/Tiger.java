package ru.job4j.tracker;

/**
 * 2. Перегрузка конструктора.[#257583]
 */
public class Tiger extends Predator {
    private String name;

    public Tiger() {
        super();
        System.out.println("class Tiger");
    }

    public Tiger(String name) {
        this.name = name;
    }
}
