package ru.job4j.pojo;

import java.util.Date;

/**
 * 2. Модель данных.[#257589]
 */
public class College {
    public static void main(String[] args) {
        Student vasea = new Student();
        vasea.setName("Vasilii");
        vasea.setSurname("Ivanov");
        vasea.setGroup("4d");
        vasea.setEnter(new Date());
        System.out.println("фио студента: " + vasea.getName() + " "
                                            + vasea.getSurname() + System.lineSeparator()
                                            + "группа: " + vasea.getGroup() + System.lineSeparator()
                                            + "дата поступленя: " + vasea.getEnter());
    }
}
