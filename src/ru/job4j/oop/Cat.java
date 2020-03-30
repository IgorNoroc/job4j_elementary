package ru.job4j.oop;

/**
 * 1.1. Создание объекта[#257571]
 */
public class Cat {
    private String food;
    private String name;

    /**
     * Выводим в консоль имя кошки и что она ест.
     */
    public void show() {
        System.out.println(this.name + " eating " + this.food);
    }

    /**
     * Задаём еду для кошки.
     *
     * @param meat еда.
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * Задём кличку кошке.
     *
     * @param nick кличка.
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
