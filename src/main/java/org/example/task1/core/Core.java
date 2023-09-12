package org.example.task1.core;

import java.util.*;

public class Core {

    public Core() {

    }

    public List<String> ranges(String s) throws Exception {
        List<String> stringList = new LinkedList<>();
        int range;
        s = s.replaceAll("[^-?0-9]+", " ");
        List<String> strings = Arrays.asList(s.trim().split(" "));
        for (int i = 0; i < strings.size() - 1; i += 2) {
            range = Integer.parseInt(strings.get(i + 1)) - Integer.parseInt(strings.get(i));
            if (range >= 0) {
                stringList.add(String.valueOf(range));
            } else {
                throw new Exception("Ошибка, некорректный диапазон");
            }
        }
        return stringList;
    }

    /**
     * Задание 2
     */

    public Boolean intersectionRanges1(String string) {
        String[][] strings = intersectionRanges(string);
        for (int i = 0; i < strings.length - 1; i++) {
            if (Integer.parseInt(strings[i][1]) >= Integer.parseInt(strings[i + 1][0])) {
                return true;
            }
        }
        return false;
    }

    private String[][] intersectionRanges(String s) {
        String[] strings = s.split(", ");
        String[][] strings1 = new String[strings.length][2];
        for (int i = 0; i < strings.length; i++) {
            strings1[i] = strings[i].split(" ");
        }
        bubbleSort(strings1);
        return strings1;
    }

    private static void bubbleSort(String[][] sortArr) {
        for (int k = 0; k < sortArr.length; k++) {
            for (int i = 0; i < sortArr.length - 1; i++) {
                if (Integer.parseInt(sortArr[i][0]) > Integer.parseInt(sortArr[i + 1][0])) {
                    String[] swap = sortArr[i];
                    sortArr[i] = sortArr[i + 1];
                    sortArr[i + 1] = swap;
                }
            }
        }
    }
}
