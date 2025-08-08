package com.array;

public class SumandAverage {
	public static void main(String[] args) {
		int[] arr = { 25, 11, 7, 75, 56 };
		int sum = 0;

		for (int num : arr) {
			sum += num;
		}

		double average = (double) sum / arr.length;

		System.out.println("Sum of array elements: " + sum);
		System.out.println("Average of array elements: " + average);
	}
}
