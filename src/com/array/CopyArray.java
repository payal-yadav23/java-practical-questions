package com.array;

public class CopyArray {
	public static void main(String[] args) {
		int[] original = { 10, 20, 30, 40, 50 };
		int[] copy = new int[original.length];

		for (int i = 0; i < original.length; i++) {
			copy[i] = original[i];
		}

		System.out.print("Original array: ");
		for (int num : original) {
			System.out.print(num + " ");
		}

		System.out.print("\nCopied array: ");
		for (int num : copy) {
			System.out.print(num + " ");
		}
	}
}
