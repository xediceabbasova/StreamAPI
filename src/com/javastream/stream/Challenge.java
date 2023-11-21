package com.javastream.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Challenge {
    public static String getString(List<Integer> list) {
        return list.stream()
                .map(i -> (i % 2 == 0) ? "e" + i : "o" + i)
                .collect(Collectors.joining(","));
    }
}
