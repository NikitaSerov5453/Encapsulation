package org.example.task3.views;

import org.example.task3.core.Money;
import org.example.task3.core.Operation;

public class View {
    Operation operation = new Operation();
    public View() {

    }

    public void compare(Money money, Money money1) {
        Operation operation = new Operation();
        if (operation.comparison(money, money1)) {
            System.out.println(money + " – Больше");
        }  else {
            System.out.println(money1 + " – Больше");
        }
    }

    public void addition(Money money, Money money1) {
        System.out.println(operation.addition(money, money1));
    }

    public void subtraction(Money money, Money money1) {
        System.out.println(operation.subtraction(money, money1));
    }

    public void multiplication(Money money, int multiplier) {
        System.out.println(operation.multiplication(money, multiplier));
    }

    public void multiplication(Money money, double multiplier) {
        System.out.println(operation.multiplication(money, multiplier));
    }

    public void division(Money money, int divider) {
        System.out.println(operation.division(money, divider));
    }

    public void division(Money money, double divider) {
        System.out.println(operation.division(money, divider));
    }
}
