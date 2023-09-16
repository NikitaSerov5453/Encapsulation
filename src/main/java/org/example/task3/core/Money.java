package org.example.task3.core;

public class Money {
    private long hryvnia;
    private byte penny;
    public Money() {

    }

    public long getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        if (hryvnia >= 0) {
            this.hryvnia = hryvnia;
        }
    }

    public byte getPenny() {
        return penny;
    }

    public void setPenny(int penny) {
        if (penny < 100 && penny >= 0) {
            this.penny = (byte) penny;
        }
    }

    @Override
    public String toString() {
        return hryvnia + "," + String.format("%02d", penny);
    }

}
