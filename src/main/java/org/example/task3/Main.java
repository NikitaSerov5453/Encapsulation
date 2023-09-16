package org.example.task3;

import org.example.task3.core.Money;
import org.example.task3.views.View;

/**
 * ВНИМАНИЕ!!!
 * Все задания должны быть решены с использованием
 * объектного подхода. Создавать классы и работать с объектами. Соблюдать принцип инкапсуляции
 *
 * Задание 3
 * Создать класс Money (Деньги) для работы с денежными
 * суммами. Число должно быть представлено двумя полями:
 * ■ типа long – для гривен;
 * ■ типа byte – для копеек.
 * Реализовать вывод значения на экран, при этом дробная
 * часть должна быть отделена от целой части запятой. Реализовать сложение, вычитание, деление сумм, деление суммы
 * на дробное число, умножение на дробное число и операции
 * сравнения. Протестировать с использованием JUnit.
 */

public class Main {
    public static void main(String[] args) {
        Money money = new Money();
        Money money1 = new Money();
        View view = new View();
        money.setHryvnia(159);
        money1.setHryvnia(10);
        money.setPenny(99);
        money1.setPenny(34);
        view.addition(money, money1);
        view.subtraction(money, money1);
        view.multiplication(money, 3);
        view.multiplication(money, 3.0);
        view.multiplication(money, 3.1);
        view.division(money, 10);
        view.division(money, 10.0);
        view.division(money,10.1);
        view.compare(money, money1);
    }
}
