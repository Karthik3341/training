package com.chainsys.day5;

public class UmbrellaStr {

	public static void main(String[] args) {
		String a = "Umbrella";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'e') {
				System.out.println("E is present in the word");
			}
		}
	}
}
