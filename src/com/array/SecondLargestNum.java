package com.array;

public class SecondLargestNum {

	public static void main(String[] args) {

		int[] arr = { 5, 8, 1, 3, 9, 6 };

		int largenumber = arr[0];
		int secondnum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largenumber) {
				secondnum = largenumber;
				largenumber = arr[i];
			} else if (arr[i] > secondnum && arr[i] != largenumber) {
				secondnum = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != largenumber && arr[i] > secondnum) {
				secondnum = arr[i];
			}
		}

		if (secondnum == Integer.MIN_VALUE) {
			System.out.println("No number");
		} else {
			System.out.println("Second Larget number :" + secondnum);
		}
	}
}
