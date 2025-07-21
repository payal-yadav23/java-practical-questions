package com.array;

import java.util.Scanner;

public class SortVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] inputs = new String[5];
		String[] vowelsArray = new String[5]; // To store vowels of each fruit
		int[] vowelCounts = new int[5]; // To store vowel counts

		System.out.println("Enter 5 fruit names:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Input : ");
			inputs[i] = sc.next().toLowerCase();
		}

		for (int i = 0; i < 5; i++) {
			String str = inputs[i];
			String vowels = "";
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels += ch;
					count++;
				}
			}

			// Store results in arrays
			vowelsArray[i] = vowels;
			vowelCounts[i] = count;
		}

		// Display result
		for (int i = 0; i < 5; i++) {
			System.out.println("\nInput: " + inputs[i]);
			System.out.println("Vowels: " + vowelsArray[i]);
			System.out.println("Vowel Count: " + vowelCounts[i]);
		}

		sc.close();
	}
}
