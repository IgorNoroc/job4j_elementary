package ru.job4j.condition;

/**
 * 9. Площадь треугольника.[#257449]
 */
public class TrgArea {
    /**
     * Площадь треугольника.
     *
     * @param a сторона а.
     * @param b сторона б.
     * @param c сторона с.
     * @return площадь.
     */
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }

    /**
     * Main.
     * @param args
     */
    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
