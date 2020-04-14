package ru.job4j.profession;

/**
 * 3. Реализация профессий в коде[#257587]
 */
public class Engineer extends Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    @Override
    public String getName() {
        return name;
    }

    /**
     * Создаём проект.
     *
     * @param project тип проекта.
     */
    public void createProject(Project project) {
    }
}
