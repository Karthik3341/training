package com.chainsys.day5;

public class HelloworldArr {

	public static void main(String[] args) {
		String word = "HelloWorld";
		char find = 'o';
		int times = 0;

		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == find) {
				times++;
			}
		}
		System.out.println(find + " is Present " + times + " number of times");
	}

}
