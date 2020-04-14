package ru.job4j.loop;

/**
 * 5.4. Протеиновая диета.[#257483]
 */
public class Fitness {
    /**
     * Вычисляем время, когда однин человек дагонит второго
     * в досижении.
     *
     * @param ivan первый человек.
     * @param nik  второй человек.
     * @return количество месяцев.
     */
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
