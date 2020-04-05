package ru.job4j.ex;

/**
 * 0.5. Иерархия исключений и множественный catch.[#257559]
 */
public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String msg) {
        super(msg);
    }
}
