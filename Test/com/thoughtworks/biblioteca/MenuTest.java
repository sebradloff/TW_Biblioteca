package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuTest {
    @Test
    public void shouldPrintOutMenuOptionListBooks(){
        PrintStream printStream = mock(PrintStream.class);

        Menu menu = new Menu(printStream);
        menu.displayOptions();

        verify(printStream).println("1. List Books");

    }
    @Test
    public void shouldPromptUserToPickAnOption(){

        PrintStream printStream = mock(PrintStream.class);
        Menu menu = new Menu(printStream);
        menu.promptUser();

        verify(printStream).println("Please Pick an Option");
    }
    @Test
    public void shouldReturnIntegerOfUserChoiceWhenTheyPickAnOption(){
        PrintStream printStream = mock(PrintStream.class);
        Menu menu = new Menu(printStream);

        assertEquals(menu.receiveUserInput("1"),1);
    }

}