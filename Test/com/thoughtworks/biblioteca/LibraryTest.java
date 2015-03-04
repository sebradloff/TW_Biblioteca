package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {
    @Test
    public void shouldAddOneBookToBooksArrayList(){
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(printStream);

        Book book = new Book("Book Title1", "Author1", 2001, printStream);

        library.addBook(book);

        assertEquals(library.getBooks().size(), 1);
    }
    @Test
    public void shouldDisplayAllBookDetailsForAllBooksInBooksClass() {
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(printStream);
        Book book1 = new Book("Book Title1", "Author1", 2001, printStream);
        Book book2 = new Book("Book Title2", "Author2", 2002, printStream);
        Book book3 = new Book("Book Title3", "Author3", 2003, printStream);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAllBookDetails();

        verify(printStream).println("Title | Author | Year Published");
        verify(printStream).println("Book Title1 | Author1 | 2001");
        verify(printStream).println("Book Title2 | Author2 | 2002");
        verify(printStream).println("Book Title3 | Author3 | 2003");
    }

}