package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by sradloff on 3/3/15.
 */
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private PrintStream printStream;


    public Book(String title, String author, int yearPublished, PrintStream printStream) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.printStream = printStream;
    }

    public void printTitle() {
        printStream.println(title);
    }

    public void printAllDetails() {
        printStream.println(title + printPipe() + author + printPipe() + yearPublished);
    }
    private String printPipe(){
        return " | ";
    }



}
