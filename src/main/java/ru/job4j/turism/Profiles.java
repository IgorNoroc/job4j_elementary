package ru.job4j.turism;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Список адресов[#257388]
 */
public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}
