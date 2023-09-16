package org.example.task6.core;

import java.util.Date;

public class ReaderTicket {
    public ReaderTicket() {

    }

    private int readerTicketIDNumber;
    private Date date;
    private int time;

    public int getReaderTicketIDNumber() {
        return readerTicketIDNumber;
    }

    public void setReaderTicketIDNumber(int readerTicketIDNumber) {
        this.readerTicketIDNumber = readerTicketIDNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
