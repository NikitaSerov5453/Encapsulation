package org.example.task5.core;

public class Operation {
    public Operation() {

    }

    public int comparison(ComplexNumber complexNumber, ComplexNumber complexNumber1) {
        if (complexNumber.getRealNumbers() == complexNumber1.getRealNumbers()) {
            return 1;
        } else if (complexNumber.getRealNumbers() > complexNumber1.getRealNumbers()) {
            return 2;
        } else {
            return 3;
        }
    }

    public ComplexNumber addition(ComplexNumber complexNumber, ComplexNumber complexNumber1) {
        ComplexNumber complexNumber2 = new ComplexNumber();
        complexNumber2.setRealNumbers(complexNumber.getRealNumbers() + complexNumber1.getRealNumbers());
        complexNumber2.setImaginaryUnit(complexNumber.getImaginaryUnit() + complexNumber1.getImaginaryUnit());
        return complexNumber2;
    }

    public ComplexNumber subtraction(ComplexNumber complexNumber, ComplexNumber complexNumber1) {
        ComplexNumber complexNumber2 = new ComplexNumber();
        complexNumber2.setRealNumbers(complexNumber.getRealNumbers() - complexNumber1.getRealNumbers());
        complexNumber2.setImaginaryUnit(complexNumber.getImaginaryUnit() - complexNumber1.getImaginaryUnit());
        return complexNumber2;
    }

    public ComplexNumber multiplication(ComplexNumber complexNumber, ComplexNumber complexNumber1) {
        ComplexNumber complexNumber2 = new ComplexNumber();
        complexNumber2.setRealNumbers((complexNumber.getRealNumbers() * complexNumber1.getRealNumbers()) -
                (complexNumber.getImaginaryUnit() * complexNumber1.getImaginaryUnit()));
        complexNumber2.setImaginaryUnit((complexNumber.getImaginaryUnit() * complexNumber1.getRealNumbers()) +
                (complexNumber.getRealNumbers() * complexNumber1.getImaginaryUnit()));
        return complexNumber2;
    }
}
