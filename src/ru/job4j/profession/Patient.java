package ru.job4j.profession;

/**
 * 3. Реализация профессий в коде[#257587]
 */
public class Patient {
    private String name;
    private String someone;
    private Programmer programmer;

    public Patient(String name, String someone) {
        this.name = name;
        this.someone = someone;
    }

    public Patient(Programmer patient, String name) {
        this.name = name;
        this.programmer = patient;
    }
}
