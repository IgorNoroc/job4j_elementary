package ru.job4j.tracker;

import java.util.Scanner;

/**
 * 2.1. Реализация класса StartUI[#257548]
 */
public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("===================");
            } else if (select == 1) {
                System.out.println("=== All items ===");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item.getName());
                }
                System.out.println("===================");
            } else if (select == 2) {
                System.out.println("Please, enter Id of need item: ");
                String id = scanner.nextLine();
                System.out.println("Please, enter new item: ");
                Item item = new Item(scanner.nextLine());
                if (tracker.replace(id, item)) {
                    System.out.println("Edit was successful!");
                } else {
                    System.out.println("Please, check you enter data. Enter was unsuccessful");
                }
                System.out.println("===================");
            } else if (select == 3) {
                System.out.println("Please, enter item Id what you want delete: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Item " + id + " was deleted");
                } else {
                    System.out.println("That Id not found");
                }
                System.out.println("===================");
            } else if (select == 4) {
                System.out.println("Please, enter item Id: ");
                Item item = tracker.findById(scanner.nextLine());
                System.out.println("Found item : " + item.getName());
                System.out.println("===================");
            } else if (select == 5) {
                System.out.println("Please, enter name to search: ");
                Item[] items = tracker.findByName(scanner.nextLine());
                System.out.println("=== All items of you search ===");
                for (Item item : items) {
                    System.out.println(item.getName());
                }
                System.out.println("===================");
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by names");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
