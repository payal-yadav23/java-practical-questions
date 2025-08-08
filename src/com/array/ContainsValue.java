package com.array;

import java.util.Scanner;

public class ContainsValue {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value to check: ");
		int value = sc.nextInt();

		boolean found = false;
		for (int num : arr) {
			if (num == value) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Array contains the value " + value);
		} else {
			System.out.println("Array does not contain the value " + value);
		}

		sc.close();
	}
}
