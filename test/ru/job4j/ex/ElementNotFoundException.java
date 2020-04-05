package ru.job4j.ex;

/**
 * 0.4. Пользовательские исключения.[#257558]
 */
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String msg) {
        super(msg);
    }
}
