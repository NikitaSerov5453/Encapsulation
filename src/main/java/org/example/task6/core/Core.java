package org.example.task6.core;

import java.time.LocalDate;

public class Core {
    public Journal journal = new Journal();
    public Core() {

    }

    public Book createBook(String author, String bookName) {
        Book book = new Book();

        book.setAuthor(author);
        book.setBookName(bookName);
        return book;
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

    public Student createStudent(String surname, String name, int groupIDNumber) {
        Student student = new Student();

        student.setSurname(surname);
        student.setName(name);
        student.setGroupIDNumber(groupIDNumber);
        return student;
    }

    public ReaderTicket issueReaderTicket(Student student) {
        ReaderTicket readerTicket = new ReaderTicket();

        readerTicket.setStudent(student);
        return readerTicket;
    }

}
