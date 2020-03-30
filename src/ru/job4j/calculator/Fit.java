package ru.job4j.calculator;

/**
 * 6. Идеальный вес.[#257443]
 */
public class Fit {
    /**
     * Рассчитываем идиальный вес для мужчины.
     *
     * @param height рост.
     * @return идеальный вес.
     */
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Рассчитываем идиальный вес для женщины.
     *
     * @param height рост.
     * @return идеальный вес.
     */
    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        double man = Fit.manWeight(180);
        System.out.println("Man 180 is " + man);

        double woman = Fit.womanWeight(160);
        System.out.println("Woman 160 is " + woman);
    }
}
