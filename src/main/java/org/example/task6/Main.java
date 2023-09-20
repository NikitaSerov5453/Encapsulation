package org.example.task6;

import org.example.task6.core.*;

import java.time.LocalDate;

/**
 * ВНИМАНИЕ!!!
 * Все задания должны быть решены с использованием
 * объектного подхода. Создавать классы и работать с объектами. Соблюдать принцип инкапсуляции
 *
 * Задание 6
 * В библиотеке решили автоматизировать учет книг, выданных студентам.
 * Студент, для того чтобы получить книгу, должен получить
 * читательский билет, если не получал ранее.
 * В читательском билете содержится информация:
 * ■ номер билета;+
 * ■ фамилия и имя студента;+
 * ■ номер группы.+
 * При выдаче книги библиотекарь фиксирует в журнале:
 * ■ название и автора книги;+
 * ■ номер билета, на который выдана книга;
 * ■ дата выдачи;+
 * ■ на какое время выдана книга (в сутках).+
 * При приеме книги библиотекарь фиксирует в журнале:
 * ■ название и автора книги;
 * ■ номер билета студента, который вернул книгу;
 * ■ дата возврата.
 * Разработать модель программы, которая бы позволила
 * находить должников (студентов, которые не сдали книгу вовремя).
 */

public class Main {
    public static void main(String[] args) {
        Core core = new Core();
        Journal journal = new Journal();

        Book book = core.createBook("Барри Лонгиер", "Враг мой");
        Book book1 = core.createBook("Ден Симонс", "Гепирион");

        Student student = core.createStudent("Серов", "Никита", 5453);
        Student student1 = core.createStudent("Попов", "Денис", 13);

        ReaderTicket readerTicket = core.issueReaderTicket(student);
        ReaderTicket readerTicket1 = core.issueReaderTicket(student1);

        core.issueBook(book, readerTicket, LocalDate.of(1995, 12 , 13),14);
        core.issueBook(book1, readerTicket, LocalDate.of(1995, 12 , 13),14);
        core.issueBook(book1, readerTicket1, LocalDate.ofEpochDay(1995),14);


//        System.out.println(readerTicket);
        System.out.println();
        System.out.println();
//        System.out.println(readerTicket1);
        System.out.println(core.journal.getListBooksIssued());
    }
}
