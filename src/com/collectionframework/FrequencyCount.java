package com.collectionframework;

import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "Java", "C++", "Python", "Java");

        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : list) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }

        System.out.println("Element frequencies: " + freqMap);
    }
}
