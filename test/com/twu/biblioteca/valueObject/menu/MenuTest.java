package com.twu.biblioteca.valueObject.menu;

import com.twu.biblioteca.optionHandler.OptionHandler;
import com.twu.biblioteca.ui.OptionUIImp1;
import com.twu.biblioteca.ui.PartTitleUIImp1;
import com.twu.biblioteca.ui.UI;
import com.twu.biblioteca.valueObject.Option;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class MenuTest {

    private Menu menu;
    private Option mockOption;
    private UI mockTitleUI;
    private UI mockOptionUI;
    private ArrayList<Option> mockOptions;
    private OptionHandler mockOptionHandler;

    @Before
    public void senUp(){
        mockTitleUI = mock(PartTitleUIImp1.class);
        mockOptionUI = mock(OptionUIImp1.class);
        mockOption = mock(Option.class);
        mockOptions = new ArrayList<Option>();
        mockOptionHandler = mock(OptionHandler.class);
    }

    @Test
    public void should_show_the_biblioteca_options_menu() throws IOException {
        menu = new Menu(mockTitleUI,mockOptionUI);
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
        menu = new Menu(mockTitleUI,mockOptionUI);
        when(mockOption.getOptionHandler()).thenReturn(mockOptionHandler);
        assertTrue(menu.getItemNumber() == 0);
        menu.addOption(mockOption.getOptionName(),mockOption.getOptionHandler());
        assertTrue(menu.getItemNumber() == 1);
        assertTrue(menu.getOptions().size() == 1);
    }

}