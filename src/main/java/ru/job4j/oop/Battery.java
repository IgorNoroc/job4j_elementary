package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    /**
     * Перекидывам энергию первой батареи другой.
     *
     * @param another другая батарея.
     */
    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        Battery first = new Battery(20);
        Battery second = new Battery(40);
        first.exchange(second);
    }
}
