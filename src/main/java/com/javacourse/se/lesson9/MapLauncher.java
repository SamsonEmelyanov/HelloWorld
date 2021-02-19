package com.javacourse.se.lesson9;


import java.io.FileReader;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.*;

public class MapLauncher {

    public static void main(String[] args) {
        Map<String, Integer> wordMap = new HashMap<>();
        System.out.println("Please,enter some text");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] tokens = string.split(" ");
        for (String token : tokens) {
            String word = token.toLowerCase();
            Integer count = wordMap.get(word);
            if (count == null) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, count + 1);
            }
        }
        NavigableSet<WordWrapper> wordWrappers = convertToSet(wordMap);
        /*printMap(wordMap);*/   //use without convertToSet
        printSet(wordWrappers);
    }

    private static void printSet(NavigableSet<com.javacourse.se.lesson9.WordWrapper> wordWrappers) {
        for (com.javacourse.se.lesson9.WordWrapper wordWrapper : wordWrappers) {
            System.out.println(wordWrapper);
        }

    }

    private static NavigableSet<com.javacourse.se.lesson9.WordWrapper> convertToSet(Map<String, Integer> wordMap) {
        wordMap.remove("f");// remove element "f"
        wordMap.remove("fs", 2);// remove element "fs" and value 2
        wordMap.replace("f", 2); // replace element "f" value 2
        NavigableSet<com.javacourse.se.lesson9.WordWrapper> wordSet = new TreeSet<>();
        for (Map.Entry<String, Integer> e : wordMap.entrySet()) {
            wordSet.add(new com.javacourse.se.lesson9.WordWrapper(e.getKey(), e.getValue()));
        }
        ;
        return wordSet;

    }

 /*   private static void printMap(Map<String,Integer>wordMap){
        Map<String,Integer>wordTreeMap=new TreeMap<>(wordMap);
        Set<String>keys = wordTreeMap.keySet();
        for(String key : keys){
            System.out.printf("%-10s%-10s \n",key,wordMap.get(key));
        }
    }*/
}
