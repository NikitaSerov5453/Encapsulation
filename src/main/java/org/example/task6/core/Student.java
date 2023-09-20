package org.example.task6.core;

public class Student {
    private String surname;
    private String name;
    private int groupIDNumber;
    private ReaderTicket readerTicket;
    public Student() {

    }
    public ReaderTicket getReaderTicket() {
        return readerTicket;
    }

    public void setReaderTicket(ReaderTicket readerTicket) {
        this.readerTicket = readerTicket;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupIDNumber() {
        return groupIDNumber;
    }

    public void setGroupIDNumber(int groupIDNumber) {
        this.groupIDNumber = groupIDNumber;
    }

    @Override
    public String toString() {
        return "\nФамилия: " + surname +
                "\nИмя: " + name +
                "\nГруппа №: " + groupIDNumber;
    }
}
