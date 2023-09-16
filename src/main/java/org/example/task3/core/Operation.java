package org.example.task3.core;

public class Operation {

    public Operation() {

    }

    public Money addition(Money money, Money money1) {
        Money money2 = new Money();
        byte a = (byte) (money.getPenny() + money1.getPenny());
        int b = 0;
        if (a > 100) {
            b = 1;
            a = (byte) (a % 100);
        }
        money2.setPenny(a);
        money2.setHryvnia(money.getHryvnia() + money1.getHryvnia() + b);
        return money2;
    }

    public Money subtraction(Money money, Money money1) {
        Money money2 = new Money();
        byte a = (byte) (money.getPenny() - money1.getPenny());
        int b = 0;
        if (a < 0) {
            b = -1;
            a = (byte) (100 + a);
        }
        money2.setPenny(a);
        money2.setHryvnia(money.getHryvnia() - money1.getHryvnia() + b);
        return money2;
    }

    public Money division(Money money, int divider) {
        Money money1 = new Money();
        int c = (int) (((double) money.getHryvnia() / divider) * 100);
        byte a = (byte) (money.getPenny() / divider + c);
        if (a > 100) {
            a = (byte) (a % 100);
        }
        money1.setPenny(a);
        money1.setHryvnia(money.getHryvnia() / divider);
        return money1;
    }

    public Money division(Money money, double divider) {
        Money money1 = new Money();
        double c = (((double) money.getHryvnia() / divider) * 100);
        double a = money.getPenny() / divider + c;
        if (a > 100) {
            a = a % 100;
        }
        money1.setPenny((byte) a);
        money1.setHryvnia((int) (money.getHryvnia() / divider));
        return money1;
    }

    public Money multiplication(Money money, int multiplier) {
        Money money1 = new Money();
        int a = money.getPenny() * multiplier;
        int b = 0;
        if (a > 100) {
            b = a / 100;
            a = (a % 100);
        }
        money1.setPenny(a);
        money1.setHryvnia(money.getHryvnia() * multiplier + b);
        return money1;
    }

    public Money multiplication(Money money, double multiplier) {
        Money money1 = new Money();
        double c = ((money.getHryvnia() * multiplier) % 1) * 100;
        double a = money.getPenny() * multiplier;
        double b = 0;
        if (a > 100) {
            b = a / 100;
            a = a % 100;
        }
        money1.setPenny((int) ((byte) a + c));
        money1.setHryvnia((long) (money.getHryvnia() * multiplier + b));
        return money1;
    }

    public boolean comparison(Money money1, Money money2) {
        if (money1.getHryvnia() > money2.getHryvnia()) {
            return true;
        } else if (money1.getHryvnia() == money2.getHryvnia()) {
            return money1.getPenny() > money2.getPenny();
        } else {
            return false;
        }
    }
}
