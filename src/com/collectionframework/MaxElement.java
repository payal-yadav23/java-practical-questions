package com.collectionframework;

import java.util.*;

public class MaxElement {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 45, 67, 2, 89, 34);

		int max = Collections.max(numbers);
		System.out.println("Maximum element: " + max);
	}
}
