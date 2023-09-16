package org.example.task5.views;

import org.example.task5.core.ComplexNumber;
import org.example.task5.core.Operation;

public class View {
    Operation operation = new Operation();

    public View() {

    }

    public void addition(ComplexNumber complexNumber, ComplexNumber complexNumber1) {
        System.out.println(operation.addition(complexNumber, complexNumber1));//9 + 15i
    }

    public void subtraction(ComplexNumber complexNumber, ComplexNumber complexNumber1) {
        System.out.println(operation.subtraction(complexNumber, complexNumber1));//-1 + 1i
    }

    public void multiplication(ComplexNumber complexNumber, ComplexNumber complexNumber1) {
        System.out.println(operation.multiplication(complexNumber, complexNumber1));//-36+68i
    }

    public void comparison(ComplexNumber complexNumber, ComplexNumber complexNumber1) {
        if (operation.comparison(complexNumber, complexNumber1) == 1) {
            System.out.println("Комплексные числа равны");
        } else if (operation.comparison(complexNumber, complexNumber1) == 2) {
            System.out.println(complexNumber + " Больше");
        } else if (operation.comparison(complexNumber, complexNumber1) == 3) {
            System.out.println(complexNumber1 + " Больше");
        }
    }

}
