package com.thoughtworks.biblioteca;

import java.io.PrintStream;

/**
 * Created by hyoo on 3/4/15.
 */
public class Menu {

    private PrintStream printStream;

    public Menu(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void displayOptions() {
        printStream.println("1. List Books");
    }

    public void promptUser() {
        printStream.println("Please Pick an Option");
    }

    public int receiveUserInput(String userInput) {
        return (int) userInput;
    }
}
