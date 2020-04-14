package ru.job4j.profession;

/**
 * 3. Реализация профессий в коде[#257587]
 */
public class Builder extends Engineer {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    @Override
    public String getName() {
        return name;
    }

    /**
     * Строитель строит новый дом по модели.
     *
     * @param model тип дома.
     * @return новый дом.
     */
    public House build(House model) {
        return new House("BigBan");
    }

    /**
     * Может ли строитель построить этот заказ?
     *
     * @param order заказ.
     * @return да или нет.
     */
    public boolean build(String order) {
        return true;
    }
}
