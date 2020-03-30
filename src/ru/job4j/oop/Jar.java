package ru.job4j.oop;

/**
 * 1.7. Состояние объекта.[#257577]
 */
public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }

    /**
     * Перкидываем первому объекту значение второго объекта.
     *
     * @param another
     */
    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }
}
