package com.array;

public class EvenOddCount {
	public static void main(String[] args) {
		int[] arr = { 10, 21, 4, 45, 66, 93, 1 };
		int evenCount = 0, oddCount = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Even numbers count: " + evenCount);
		System.out.println("Odd numbers count: " + oddCount);
	}
}
