package org.example.task6.core;

import java.util.ArrayList;

public class Journal {
    public Journal() {

    }

    private final ArrayList<JournalIssueBook> listBooksIssued = new ArrayList<>();
    private static final ArrayList<ReaderTicket> readerTickets = new ArrayList<>();

    public ArrayList<JournalIssueBook> getListBooksIssued() {
        return listBooksIssued;
    }

    public void setListBooksIssued(JournalIssueBook listBooksIssued) {
        this.listBooksIssued.add(listBooksIssued);
    }

    public ArrayList<ReaderTicket> getReaderTickets() {
        return readerTickets;
    }

    public static void setReaderTicket(ReaderTicket readerTicket) {
        readerTickets.add(readerTicket);
    }
}
