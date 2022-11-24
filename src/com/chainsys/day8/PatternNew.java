package com.chainsys.day8;

public class PatternNew {

	public static void main(String[] args) {
		int row = 7;
		for (int i = row; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				if (j % 2 == 0) {
					System.out.print(0 + "");
				} else {
					System.out.print(1 + "");
				}
			}
			System.out.println();
		}
	}
}