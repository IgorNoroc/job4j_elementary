package ru.job4j.ex;

/**
 * 0.5. Иерархия исключений и множественный catch.[#257559]
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
