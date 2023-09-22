package org.example.task6.core;

import java.time.LocalDate;

public class Core {
    public Journal journal = new Journal();
    public Core() {

    }

    public void issueBook(Book book, ReaderTicket readerTicket, LocalDate dateIssue, int term) {
        JournalIssueBook issueBook = new JournalIssueBook();

        issueBook.setAuthor(book.getAuthor());
        issueBook.setBookName(book.getBookName());
        issueBook.setDateIssue(dateIssue);
        issueBook.setTermIssue(term);
        issueBook.setGroupID(readerTicket.getNumberCreation());
        readerTicket.setListBooksIssued(issueBook);
        this.journal.setListBooksIssued(issueBook);
    }

    public ReaderTicket issueReaderTicket(Student student) {
        ReaderTicket readerTicket = new ReaderTicket();

        readerTicket.setStudent(student);
        Journal.setReaderTicket(readerTicket);
        return readerTicket;
    }
}
