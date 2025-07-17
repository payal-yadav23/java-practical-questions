package com.string;

public class FrequencyCount {

	public void charFrequency(String str) {
		int[] freq = new int[256];
		for (char ch : str.toCharArray())
			freq[ch]++;
		for (int i = 0; i < 256; i++) {
			if (freq[i] > 0)
				System.out.println((char) i + ": " + freq[i]);
		}
	}

	public static void main(String[] args) {

		FrequencyCount fc = new FrequencyCount();
		fc.charFrequency("abcdfehsgcbgkchcjah");

	}

}
