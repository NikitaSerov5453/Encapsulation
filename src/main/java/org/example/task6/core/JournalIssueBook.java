package org.example.task6.core;

import java.time.LocalDate;

public class JournalIssueBook {

    private LocalDate dateIssue;
    private ReaderTicket readerTicket;
    private int termIssue;
    private String author;
    private String bookName;
    private int groupID;

    public JournalIssueBook() {

    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public LocalDate getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(LocalDate dateIssue) {
        this.dateIssue = dateIssue;
    }

    public int getTermIssue() {
        return termIssue;
    }

    public void setTermIssue(int termIssue) {
        this.termIssue = termIssue;
    }

    @Override
    public String toString() {
        return  "\nАвтор: " + author +
                "\nНазвание книги: " + bookName +
                "\nДата выдачи: " + dateIssue +
                "\nСрок на который выдана книга(в днях): " + termIssue +
                "\nНомер билета на который выдана книга: " + groupID + "\n";
    }
}
