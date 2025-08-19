package com.collectionframework;

import java.util.*;

public class SortHashMapByValue {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Java", 10);
		map.put("Python", 25);
		map.put("C++", 5);

		// Convert to list and sort by value
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());

		System.out.println("HashMap sorted by values:");
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
