package org.example.task1.views;

import java.util.List;

public class View {

    public View() {

    }

    public void printRange(List<String> stringList) {
        System.out.println(String.join(" ", stringList));
    }

    public void printIntersection(boolean b) {
        if (b) {
            System.out.println("Есть пересечение");
        } else {
            System.out.println("Нет пересечения");
        }
    }
}
