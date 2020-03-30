package ru.job4j.oop;

/**
 * 1.6. Взаимодействие объектов.[#257575]
 */
public class Story {
    /**
     * Main.
     * История краной шапочки.
     *
     * @param args
     */
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
