package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. Чтение из консоли. Класс Scanner.[#257537]
 */
public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = new Random().nextInt(3);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        scanner.nextLine();
        if (answer == 0) {
            System.out.println("Да");
        } else if (answer == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
