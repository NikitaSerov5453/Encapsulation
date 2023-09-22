package org.example.task6.core;

import java.util.ArrayList;

public class ReaderTicket {
    private static int readerTicketIDNumber;
    private final int numberCreation;

    public void setStudent(Student student) {
        this.student = student;
    }

    private Student student;
    private final ArrayList<JournalIssueBook>  listBooksIssued = new ArrayList<>();


    public ReaderTicket() {
        readerTicketIDNumber++;
        this.numberCreation = readerTicketIDNumber;
    }

    public int getNumberCreation() {
        return numberCreation;
    }

    public void setListBooksIssued(JournalIssueBook book) {
        listBooksIssued.add(book);
    }

    public ArrayList<JournalIssueBook> getListBooksIssued() {
        return listBooksIssued;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return  "\nЧитательский билет №: " + numberCreation +
                "\nФамилия: " + student.getSurname() +
                "\nИмя: " + student.getName() +
                "\nСписок выданных книг:\n" + getListBooksIssued();
    }

}
