package com.javacourse.se.lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapLauncherStreamAPI {
    public static void main(String[] args) {
        List<String> listWorld = new ArrayList<>();
        listWorld.add("Саша");
        listWorld.add("Саша");
        listWorld.add("Петя");
        listWorld.add("Ваня");
        listWorld.add("Паха");
        listWorld.add("Макс");
        listWorld.add("Вова");
        listWorld.add("Света");
        listWorld.add("Гена");
        Map<String, Long> wordsByCount = listWorld.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));

        String prevalentWord = wordsByCount.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println(prevalentWord);
    }


}

