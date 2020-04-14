package ru.job4j.collection;

import java.util.HashMap;

/**
 * 0. Map, HashMap[#257524]
 */
public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mail1@gmail.com", "Vasea");
        map.put("mail2@gmail.com", "Dusea");
        map.put("mail3@gmail.com", "Stepan");
        map.put("mail4@gmail.com", "Vasea");
        for (String account : map.keySet()) {
            System.out.println(account + " " + map.get(account));
        }
    }
}
