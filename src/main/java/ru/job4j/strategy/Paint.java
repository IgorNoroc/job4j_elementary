package ru.job4j.strategy;

/**
 * 7. Шаблон проектирования - Стратегия.[#257550]
 */
public class Paint {

    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }
}
