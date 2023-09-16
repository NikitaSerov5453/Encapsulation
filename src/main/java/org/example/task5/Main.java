package org.example.task5;

import org.example.task5.core.ComplexNumber;
import org.example.task5.core.Operation;
import org.example.task5.views.View;

/**
 * ВНИМАНИЕ!!!
 * Все задания должны быть решены с использованием
 * объектного подхода. Создавать классы и работать с объектами. Соблюдать принцип инкапсуляции.
 * <p>
 * Задание 5
 * Разработать программу для представления комплексных
 * чисел с возможностью задания вещественной и мнимой частей, как числами типов double, так и целыми числами.
 * Обеспечить выполнение операций:
 * ■ сравнения чисел;
 * ■ сложения;
 * ■ вычитания;
 * ■ умножения.
 * Протестировать с использованием JUnit.
 */

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ComplexNumber complexNumber = new ComplexNumber();
        ComplexNumber complexNumber1 = new ComplexNumber();
        complexNumber.setRealNumbers(4);
        complexNumber.setImaginaryUnit(8);
        complexNumber1.setRealNumbers(5);
        complexNumber1.setImaginaryUnit(7);
        view.addition(complexNumber, complexNumber1);
        view.subtraction(complexNumber, complexNumber1);
        view.multiplication(complexNumber,complexNumber1);
        view.comparison(complexNumber, complexNumber1);
    }
}
