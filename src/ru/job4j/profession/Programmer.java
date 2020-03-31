package ru.job4j.profession;

/**
 * 3. Реализация профессий в коде[#257587]
 */
public class Programmer extends Engineer {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    @Override
    public String getName() {
        return name;
    }

    /**
     * програмист исполняет заказ.
     *
     * @param order заказ.
     */
    public void doOrder(Order order) {
    }
}
