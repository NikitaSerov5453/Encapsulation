package org.example.task4;

public class MainString {

    private int stringLength;
    char[] chars = new char[getStringLength()];

    public MainString() {

    }

    public MainString(String s) {

    }

    public MainString(char c) {

    }
    public int getStringLength() {
        return stringLength;
    }

    public void setStringLength(int stringLength) {
        this.stringLength = stringLength;
    }

    public void cleanString(String s) {
        s = "";
    }

    public int searchIndexSymbol(char c, String s) {
        return s.indexOf(c);
    }
}
