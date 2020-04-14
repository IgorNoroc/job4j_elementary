package ru.job4j.oop;

/**
 * 1.6. Взаимодействие объектов.[#257575]
 */
public class BallStory {
    /**
     * История Колобка.
     *
     * @param args
     */
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
