package ru.job4j.profession;

/**
 * 3. Реализация профессий в коде[#257587]
 */
public class Surgeon extends Doctor {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    @Override
    public String getName() {
        return name;
    }

    /**
     * Хиругр оперирует строителя.
     * @param builder строитель.
     */
    public void treatBuilder(Builder builder) {
    }
}
