package com.collectionframework;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);

        System.out.println("Sorted TreeSet: " + set);
    }
}
