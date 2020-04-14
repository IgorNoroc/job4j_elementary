package ru.job4j.io;

import java.util.Scanner;

/**
 * 2. Scanner и чтение числа из консоли.[#257538]
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру.");
        System.out.println("Два игрока берут по очереди от 1 до 3 спичек.");
        System.out.println("Победит тот кто взял последние спички.");
        System.out.println("Удачи!!!");
        System.out.println();
        int count = 11;

        while (count > 0) {
            System.out.println("Ход первого игрока: ");
            count -= Integer.valueOf(input.nextLine());
            if (count <= 0) {
                System.out.println("игрок номер один выграл");
            }
            System.out.println("На столе осталось " + count);
            System.out.println();
            System.out.println("Ход второко игрока: ");
            count -= Integer.valueOf(input.nextLine());
            if (count <= 0) {
                System.out.println("игрок номер два выграл");
            }
            System.out.println("На столе осталось " + count);
            System.out.println();
        }
    }
}
