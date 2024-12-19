package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book novel = new Book("Novel", 4);
        Book fairytale = new Book("Fairy tale", 3);
        Book fiction = new Book("Fiction", 6);
        Book cleancode = new Book("Clean code", 1);
        Book[] books = new Book[4];
        books[0] = novel;
        books[1] = fairytale;
        books[2] = fiction;
        books[3] = cleancode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println("Swap the books:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println("Display books with the name 'Clean code'");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}
