package com.collectionframework;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Java", "C++", "Python"));

		Set<String> set = new LinkedHashSet<>(list); // maintains insertion order
		list = new ArrayList<>(set);

		System.out.println("After removing duplicates: " + list);
	}
}
