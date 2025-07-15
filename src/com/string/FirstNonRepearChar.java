package com.string;

public class FirstNonRepearChar {

	public static char firstNonRepeatingChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
				return str.charAt(i);
		}
		return '_';
	}

	public static void main(String[] args) {

		System.out.println(FirstNonRepearChar.firstNonRepeatingChar("aaasc"));

	}

}
