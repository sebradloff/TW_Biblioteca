package com.thoughtworks.biblioteca;

/**
 * Created by sradloff on 3/3/15.
 */
public class Main {
    public static void main(String[] args) {
        Welcome welcome = new Welcome(System.out);
        welcome.display();
        Book book1 = new Book("TDD", "Kent Beck", 2000, System.out);
        Book book2 = new Book("RoR", "Katz", 2005, System.out);
        Library library = new Library(System.out);
        library.addBook(book1);
        library.addBook(book2);

        Menu menu = new Menu(System.out);
        menu.displayOptions();
        menu.promptUser();
    }
}
