package com.array;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = { 25, 11, 7, 75, 56 };

		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println("Largest element in the array: " + largest);
	}
}
