package ru.job4j.profession;

/**
 * 3. Реализация профессий в коде[#257587]
 */
public class Doctor extends Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    @Override
    public String getName() {
        return name;
    }

    /**
     * Доктор обследует любого человека.
     */
    public void examine(Patient patient) {
    }
}
