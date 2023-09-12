package org.example.task1;

import org.example.task1.core.Core;
import org.example.task1.views.View;
import java.util.Scanner;

/**
 * ВНИМАНИЕ!!!
 * Все задания должны быть решены с использованием
 * объектного подхода. Создавать классы и работать с объектами. Соблюдать принцип инкапсуляции.
 *
 * Задание 1
 * Создать программу, которая позволяет ввести с клавиатуры n диапазонов целочисленных значений (например, 3-10).
 * Каждый диапазон имеет начальную и конечную точку.
 * После ввода программа должна вывести длину каждого диапазона. Программа должна выводить сообщение об ошибке,
 * если начало диапазона больше, чем конец. Протестировать с
 * использованием JUnit.
 * Пример:
 * Входные данные: 3 9, -2 4, 11 15
 * Выходные 3, 6, 4
 *
 * Задание 2
 * Для задания 1 добавить возможность проверки, пересекаются ли различные диапазоны значений.
 */

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Scanner scan = new Scanner(System.in);
        Core core = new Core();
        String input = scan.nextLine();
        try {
            view.printRange(core.ranges(input));
            view.printIntersection(core.intersectionRanges1(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
