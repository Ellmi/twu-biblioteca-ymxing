package com.twu.biblioteca.ui;

import com.twu.biblioteca.valueObject.Option;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OptionUIImp1Test {

    private OptionUIImp1 optionUIImp1;
    @Mock
    private Option mockOption;

    @Before
    public void setUp(){
        optionUIImp1 = new OptionUIImp1();
        mockOption = mock(Option.class);
    }

    @Test
    public void should_use_option_ui_implement_1(){
        when(mockOption.getOptionNumber()).thenReturn(1);
        when(mockOption.getOptionName()).thenReturn("ListBooks");
        assertEquals("[" + mockOption.getOptionNumber() + "]" + mockOption.getOptionName(), optionUIImp1.uiDesign(mockOption));
    }
}