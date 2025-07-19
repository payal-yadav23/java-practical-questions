package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class LongestContinousString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next().toLowerCase(); // Make everything lowercase

		String alpha = "";

		// Keep only alphabet characters
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (Character.isLetter(a)) {
				alpha += a;
			}
		}

		// Sort all letters (with duplicates)
		alpha = sortString(alpha);

		// Find the longest continuous alphabetical sequence
		StringBuilder result = new StringBuilder();
		result.append(alpha.charAt(0)); // always add the first character

		for (int i = 1; i < alpha.length(); i++) {
			char prev = alpha.charAt(i - 1);
			char curr = alpha.charAt(i);

			if (curr == prev || curr == prev + 1) {
				result.append(curr); // continue sequence
			} else {
				break; // stop if sequence breaks
			}
		}

		// Step 4: Print the result
		System.out.println("Output: " + result.toString());

		sc.close();
	}

	// Function to sort a string
	private static String sortString(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

}
