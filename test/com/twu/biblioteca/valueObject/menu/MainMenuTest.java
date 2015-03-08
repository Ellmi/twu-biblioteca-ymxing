package com.twu.biblioteca.valueObject.menu;

import com.twu.biblioteca.ui.OptionUIImp1;
import com.twu.biblioteca.ui.PartTitleUIImp1;
import com.twu.biblioteca.ui.UI;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class MainMenuTest {
    private Menu menu;
    private UI mockTitleUI;
    private UI mockOptionUI;

    @Before
    public void senUp(){
        mockTitleUI = mock(PartTitleUIImp1.class);
        mockOptionUI = mock(OptionUIImp1.class);
    }
    @Test
    public void should_add_one_option_to_main_menu(){
        menu = new MainMenu(mockTitleUI,mockOptionUI);
        assertTrue(menu.getItemNumber()==4);
    }
}