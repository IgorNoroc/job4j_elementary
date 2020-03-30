package ru.job4j.loop;

/**
 * 5.7. Ипотека.[#257485]
 */
public class Mortgage {
    /**
     * Ипотека.
     * Расчитываем количество лет нужных для погашения кредита.
     *
     * @param amount  кредит.
     * @param salary  доход в год.
     * @param percent процент по кредиту.
     * @return кол-во лет.
     */
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double payForYear = amount * (percent / 100);
            amount = (int) ((amount + payForYear) - salary);
            year++;
        }
        return year;
    }
}
