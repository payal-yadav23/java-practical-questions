package com.array;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 25, 11, 7, 75, 56 };

		System.out.print("Original array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		System.out.print("\nReversed array: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
