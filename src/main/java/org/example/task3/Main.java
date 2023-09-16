package org.example.task3;

import org.example.task3.core.Money;
import org.example.task3.core.Operation;
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
        Operation operation = new Operation();
        Money money = new Money();
        Money money1 = new Money();
        View view = new View();
        money.setHryvnia(159);
        money1.setHryvnia(10);
        money.setPenny(99);
        money1.setPenny(34);
        System.out.println(operation.addition(money, money1));
        System.out.println(operation.subtraction(money, money1));
        System.out.println(operation.multiplication(money, 3));
        System.out.println(operation.division(money, 10.7));
        view.compare(money, money1);
    }
}
