package ru.job4j.ex;

/**
 * 0.4. Пользовательские исключения.[#257558]
 */
public class FindEl {
    /**
     * Find index by key
     *
     * @param value massive.
     * @param key   key.
     * @return index.
     * @throws ElementNotFoundException not present key.
     */
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] name = {"A", "B", "C"};
        try {
            indexOf(name, "D");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
