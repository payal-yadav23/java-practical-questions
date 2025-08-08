package com.array;

public class SmallestElement {
	public static void main(String[] args) {
		int[] arr = { 25, 11, 7, 75, 56 };

		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		System.out.println("Smallest element in the array: " + smallest);
	}
}
