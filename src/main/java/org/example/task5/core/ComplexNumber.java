package org.example.task5.core;

public class ComplexNumber {
    public ComplexNumber() {

    }

    private int realNumbers;
    private int imaginaryUnit;

    public int getRealNumbers() {
        return realNumbers;
    }

    public void setRealNumbers(int realNumbers) {
        this.realNumbers = realNumbers;
    }

    public int getImaginaryUnit() {
        return imaginaryUnit;
    }

    public void setImaginaryUnit(int imaginaryUnit) {
        this.imaginaryUnit = imaginaryUnit;
    }

    @Override
    public String toString() {
        return realNumbers + " + " + imaginaryUnit + "i";
    }
}
