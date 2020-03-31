package ru.job4j.pojo;

/**
 * 3. Массивы и модели.[#257590]
 */
public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", 23);
        Book book2 = new Book("Book2", 43);
        Book book3 = new Book("Book3", 123);
        Book book4 = new Book("Clean code", 323);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());
        }
        books[0] = book3;
        books[2] = book1;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " " + books[i].getCount());
            }
        }
    }
}
