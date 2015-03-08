package com.twu.biblioteca.valueObject.menu;

import com.twu.biblioteca.optionHandler.ListBooksOptionHandler;
import com.twu.biblioteca.optionHandler.OptionHandler;
import com.twu.biblioteca.ui.OptionUIImp1;
import com.twu.biblioteca.ui.PartTitleUIImp1;
import com.twu.biblioteca.ui.UI;
import com.twu.biblioteca.valueObject.Option;
import com.twu.biblioteca.valueObject.User;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class MenuTest {

    private Menu menu;
    private Option mockOption;
    private UI mockTitleUI;
    private UI mockOptionUI;
    private ArrayList<Option> mockOptions;
    private OptionHandler mockOptionHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private User mockUser;

    @Before
    public void senUp(){
        mockTitleUI = mock(PartTitleUIImp1.class);
        mockOptionUI = mock(OptionUIImp1.class);
        mockOption = mock(Option.class);
        mockOptions = new ArrayList<Option>();
        mockOptionHandler = mock(OptionHandler.class);
        System.setOut(new PrintStream(outContent));
        menu = new Menu(mockTitleUI,mockOptionUI);
        mockUser = mock(User.class);
    }

    @Test
    public void should_show_the_biblioteca_options_menu() throws IOException {
        mockOptions.add(mockOption);
        menu.setOptions(mockOptions);
        when(mockTitleUI.uiDesign(anyString())).thenReturn("");
        when(mockOptionUI.uiDesign(anyString())).thenReturn("");
        menu.show();
        verify(mockTitleUI, times(1)).uiDesign(anyString());
        verify(mockOptionUI,times(1)).uiDesign(anyObject());
    }

    @Test
    public void should_add_an_option_to_menu(){
        when(mockOption.getOptionHandler()).thenReturn(mockOptionHandler);
        assertTrue(menu.getItemNumber() == 0);
        menu.addOption(mockOption.getOptionName(),mockOption.getOptionHandler());
        assertTrue(menu.getItemNumber() == 1);
        assertTrue(menu.getOptions().size() == 1);
    }

    @Test
    public void should_give_a_correct_action_when_user_chose_a_option() throws IOException {
        int mockUserChoose = 1;
        ListBooksOptionHandler mockListBooksOptionHandler = mock(ListBooksOptionHandler.class);
        menu.setOptions(mockOptions);
        mockOptions.add(mockOption);
        when(mockOption.getOptionHandler()).thenReturn(mockListBooksOptionHandler);
        menu.interActOption(mockUserChoose, mockUser);
        verify(mockListBooksOptionHandler,times(1)).handle(mockUser);
    }

    @Test
    public void should_read_a_correct_numbers_when_user_type_a_nubmer(){
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        assertEquals(1, menu.readNextCommand());
    }

    @Test
    public void should_give_a_reminder_the_command_user_type_is_not_a_nubmer(){
        ByteArrayInputStream in = new ByteArrayInputStream("asd".getBytes());
        System.setIn(in);
        menu.readNextCommand();
        assertEquals("Not a number !\n",outContent.toString());
    }

}