package ru.job4j.converter;

/**
 * 5. Конвертер валюты[#257442]
 */
public class Converter {
    /**
     * Кониверируем рубли в доллары.
     *
     * @param value рубли.
     * @return доллары.
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return евро.
     */
    public static int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}
