package ru.job4j.collection;

import java.util.HashSet;

/**
 * 0. Set, HashSet, Iterator.[#257532]
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String name : autos) {
            System.out.println(name);
        }
    }
}
