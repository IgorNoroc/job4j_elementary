package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * 5. Реализовать класс Tracker[#257596]
 */
public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Получаем список заявок.
     *
     * @return список активных заявок.
     */
    public Item[] findAll() {
        Item[] result = new Item[items.length];
        int size = 0;
        for (Item item : items) {
            if (item != null) {
                result[size++] = item;
            }
        }
        return Arrays.copyOf(result, size);
    }

    /**
     * Ищем заявки в хранилище по имени.
     *
     * @param key имя
     * @return массив из совпавших имён.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int size = 0;
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                result[size++] = items[i];
            }
        }
        return Arrays.copyOf(result, size);
    }

    /**
     * Поиск в хранилище по идентификатору.
     *
     * @param id идентификатор.
     * @return найденное совпадение.
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                result = items[i];
                break;
            }
        }
        return result;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
