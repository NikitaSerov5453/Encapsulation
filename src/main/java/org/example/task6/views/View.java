package org.example.task6.views;

import org.example.task6.core.Journal;
import org.example.task6.core.JournalIssueBook;

import java.time.LocalDate;
import java.util.ArrayList;

public class View {
    public View() {

    }

    public void printDebtor(ArrayList<JournalIssueBook> listBooksIssued) {
        Journal journal = new Journal();
        LocalDate localDateNow = LocalDate.now();
        for (JournalIssueBook journalIssueBook : listBooksIssued) {
            if (localDateNow.minusDays(journalIssueBook.getTermIssue()).isAfter(journalIssueBook.getDateIssue())) {
                for (int k = 0; k < journal.getReaderTickets().size(); k++) {
                    if (journal.getReaderTickets().get(k).getNumberCreation() == journalIssueBook.getGroupID()) {
                        System.out.println(journal.getReaderTickets().get(k).getStudent());
                        System.out.println(journalIssueBook);
                        break;
                    }
                }
            }
        }
    }

}
