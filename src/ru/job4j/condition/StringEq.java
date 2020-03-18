package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = "root";
        return root.equals(login);
    }

    public static void main(String[] args) {
        String your = "your name";
        boolean userAccess = StringEq.check(your);
        System.out.println(userAccess);
    }
}
