package org.example.task3.views;

import org.example.task3.core.Money;
import org.example.task3.core.Operation;

public class View {
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
}
