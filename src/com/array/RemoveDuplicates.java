package com.array;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6, 6, 7 };
		int n = arr.length;

		System.out.println("Array without duplicates: ");

		for (int i = 0; i < n; i++) {
			boolean found = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					found = true;
				}
			}
			if (!found) {
				System.out.print(arr[i] + ", ");
			}
		}

	}

}
