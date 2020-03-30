package ru.job4j.condition;

/**
 * 9.1. String[#257453]
 */
public class Greeting {
    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " But I am a newbie.";

        int year = 2020;
        idea = idea + " " + year;
        System.out.println(idea);
    }
}
