package ru.job4j.oop;

/**
 * 1.2. Вызов метода объекта[#257573]
 */
public class Student extends Object {
    /**
     * Объект играет мелодию в консоль.
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Объект поёт песню в консоль.
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

    /**
     * Main.
     * Объект по три раза игает мелодию и поёт песню.
     *
     * @param args
     */
    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.music();
        }
        for (int i = 0; i < 3; i++) {
            petya.song();
        }
    }
}
