package com.twu.biblioteca.ui;

/**
 * Created by ymxing on 3/3/15.
 */
public class WelcomeUIImp1 implements UI{
    private String ui = "";
    private final int ROW = 3;
    @Override
    public String uiDesign(Object object) {
        String welcomeWords = (String)object,rowNormal,rowMiddle;
        rowNormal = giveSameSymbalsString('#', welcomeWords.length()*3);
        String bothEndsOfMiddleRow = giveSameSymbalsString('#', welcomeWords.length() / 2);
        String aroundWordsString = giveSameSymbalsString(' ', welcomeWords.length() - welcomeWords.length() / 2);
        rowMiddle = bothEndsOfMiddleRow + aroundWordsString + welcomeWords + aroundWordsString + bothEndsOfMiddleRow;
        ui = rowNormal + "\n" + rowMiddle + "\n" + rowNormal;
        return ui;
    }

    private String giveSameSymbalsString(char symbol, int length) {
        String string = "";
        for(int col=0;col<length;col++ ){
            string += symbol;
        }
        return string;
    }
}
