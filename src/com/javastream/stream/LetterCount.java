package com.javastream.stream;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        getTotalNumberOfLettersOfNamesLongerThanFive("A", "b", "c");
    }

    //Array elemenlarini al => stream()
    //5 den uzun isimleri filtrele => filter()
    //listedeki tum harflerin sayisini getir => mapToInt()
    //harf sayilarini topla => sum()


    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .mapToInt(String::length)
                .sum();
    }
}
