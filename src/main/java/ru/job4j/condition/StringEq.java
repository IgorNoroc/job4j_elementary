package ru.job4j.condition;

/**
 * 4.1.0. Операторы сравнения в String.[#257409].
 */
public class StringEq {
    /**
     * Проверяем логин.
     *
     * @param login логин.
     * @return
     */
    public static boolean check(String login) {
        String root = "root";
        return root.equals(login);
    }

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        String your = "your name";
        boolean userAccess = StringEq.check(your);
        System.out.println(userAccess);
    }
}
