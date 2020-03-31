package ru.job4j.profession;

/**
 * 3. Реализация профессий в коде[#257587]
 */
public class Dentist extends Doctor {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    @Override
    public String getName() {
        return name;
    }

    /**
     * Лечит программиста.
     *
     * @param patient пациент.
     */
    public void treatPatient(Programmer patient) {
    }
}
