package com.thoughtworks.biblioteca;

import java.io.IOException;
import java.io.PrintStream;

public class Menu {

    private PrintStream printStream;
    private Library library;

    public Menu(PrintStream printStream, Library library) {
        this.printStream = printStream;
        this.library = library;
    }

    public void promptUser() throws IOException {
        printStream.println("1. List Books");
        printStream.println("Please Pick an Option:");
        library.printAllBookDetails();
    }

}
