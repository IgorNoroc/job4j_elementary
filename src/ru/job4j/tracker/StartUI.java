package ru.job4j.tracker;



/**
 * 2.1. Реализация класса StartUI[#257548]
 */
public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askInt("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                tracker.add(new Item(input.askStr("Enter name: ")));
                System.out.println("===================");
            } else if (select == 1) {
                System.out.println("=== All items ===");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item);
                }
                System.out.println("===================");
            } else if (select == 2) {
                String id = input.askStr("Please, enter Id of need item: ");
                Item item = new Item(input.askStr("Please, enter new item: "));
                if (tracker.replace(id, item)) {
                    System.out.println("Edit was successful!");
                } else {
                    System.out.println("Please, check you enter data. Enter was unsuccessful");
                }
                System.out.println("===================");
            } else if (select == 3) {
                String id = input.askStr("Please, enter item Id what you want delete: ");
                if (tracker.delete(id)) {
                    System.out.println("Item " + id + " was deleted");
                } else {
                    System.out.println("That Id not found");
                }
                System.out.println("===================");
            } else if (select == 4) {
                Item item = tracker.findById(input.askStr("Please, enter item Id: "));
                System.out.println("Found item : " + item);
                System.out.println("===================");
            } else if (select == 5) {
                Item[] items = tracker.findByName(input.askStr("Please, enter name to search: "));
                System.out.println("=== All items of you search ===");
                for (Item item : items) {
                    System.out.println(item);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
