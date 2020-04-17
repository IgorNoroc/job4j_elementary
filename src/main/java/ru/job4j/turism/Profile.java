package ru.job4j.turism;

/**
 * 2. Список адресов[#257388]
 */
public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
