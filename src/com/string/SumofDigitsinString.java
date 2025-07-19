package com.string;

public class SumofDigitsinString {

	public static void main(String[] args) {
		String str = "ab212xyz34p56";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= '0' && ch <= '9') {
				sum += ch - '0';
			}
		}

		System.out.println("Sum of digits: " + sum);
	}

}
