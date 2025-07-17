package com.string;

public class RemoveDuplicate {

	public String removeDuplicates(String str) {
		StringBuilder sb = new StringBuilder();
		boolean[] seen = new boolean[256];
		for (char ch : str.toCharArray()) {
			if (!seen[ch]) {
				seen[ch] = true;
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		RemoveDuplicate rd = new RemoveDuplicate();
		System.out.println(rd.removeDuplicates("hello"));

	}

}
