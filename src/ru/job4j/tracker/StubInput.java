package ru.job4j.tracker;

/**
 * 3. Интерфейс Input[#257539]
 */
public class StubInput implements Input {
    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
