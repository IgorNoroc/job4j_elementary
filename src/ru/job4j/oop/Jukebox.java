package ru.job4j.oop;

/**
 * 1.3. Вызов метода с аргументами.[#257574]
 */
public class Jukebox {
    /**
     * Выбираем какую песеньку спеть объекту.
     *
     * @param position номер песни.
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    /**
     * Main.
     * Создаем объект и заставляем его петь.
     *
     * @param args
     */
    public static void main(String[] args) {
        Jukebox vasea = new Jukebox();
        vasea.music(1);
        vasea.music(2);
        vasea.music(9);
    }
}
