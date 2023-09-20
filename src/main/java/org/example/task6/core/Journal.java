package org.example.task6.core;

import java.util.ArrayList;

public class Journal {
    public Journal() {

    }

    private final ArrayList<JournalIssueBook> listBooksIssued = new ArrayList<>();

    public ArrayList<JournalIssueBook> getListBooksIssued() {
        return listBooksIssued;
    }

    public void setListBooksIssued(JournalIssueBook listBooksIssued) {
        this.listBooksIssued.add(listBooksIssued);
    }
}
