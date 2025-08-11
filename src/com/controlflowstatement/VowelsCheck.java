package com.controlflowstatement;

import java.util.Scanner;

public class VowelsCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char ch = sc.next().toLowerCase().charAt(0);

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is a vowel");
			break;
		default:
			System.out.println(ch + " is a consonant");
		}
		sc.close();
	}
}
