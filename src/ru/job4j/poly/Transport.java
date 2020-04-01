package ru.job4j.poly;

/**
 * 3. Интерфейс Input[#257539]
 */
public interface Transport {
    void move();

    void passengers(int count);

    double refuel(int litre);
}
