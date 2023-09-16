package org.example.task6.core;

public class Student {
    public Student() {

    }

    private String surname;
    private String name;
    private int groupIDNumber;

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
        return "Фамилия: " + surname + "Имя: " + name + "Группа №: " + groupIDNumber;
    }
}
