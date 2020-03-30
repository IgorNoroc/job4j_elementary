package ru.job4j.condition;

/**
 * 4.1.2. Глупый бот.[#257403].
 */
public class DummyBot {
    /**
     * Вопросы для бота.
     *
     * @param question вопрос
     * @return ответ бота.
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
