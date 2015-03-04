package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private BufferedReader reader;
    private Library library;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        library = mock(Library.class);
        menu = new Menu(printStream, library);
    }

    @Test
    public void shouldPrintOutMenuOptionListBooks() throws IOException {
        menu.promptUser();
        verify(printStream).println("1. List Books");
    }

    @Test
    public void shouldPromptUserToPickAnOption() throws IOException {
        menu.promptUser();
        verify(printStream).println("Please Pick an Option:");
    }

    @Test
    public void shouldListBooksWhenOneIsEntered() throws Exception {
        when(reader.readLine()).thenReturn("1");

        menu.promptUser();

        verify(library).printAllBookDetails();
    }

    //    @Test
//    public void shouldReturnIntegerOfUserChoiceWhenTheyPickAnOption(){
//        PrintStream printStrreader= mock(PrintStream.class);
//        Menu menu = new Menu(printStream);
//
//        assertEquals(menu.receiveUserInput("1"),1);
//    }

}