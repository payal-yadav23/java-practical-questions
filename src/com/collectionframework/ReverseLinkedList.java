package com.collectionframework;

import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        Collections.reverse(list);
        System.out.println("Reversed LinkedList: " + list);
    }
}
