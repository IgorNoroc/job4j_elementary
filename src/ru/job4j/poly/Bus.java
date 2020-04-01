package ru.job4j.poly;

import ru.job4j.poly.Transport;

/**
 * 3. Интерфейс Input[#257539]
 */
public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Поехали!!!");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Могу взять столько пасажиров " + count);
    }

    @Override
    public double refuel(int litre) {
        return 34.8 * litre;
    }
}
