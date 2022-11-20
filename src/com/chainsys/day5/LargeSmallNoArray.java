package com.chainsys.day5;

public class LargeSmallNoArray {

	public static void main(String[] args) {

		int numbers[] = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		int small = numbers[0];
		int large = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > large)
				large = numbers[i];
			else if (numbers[i] < small)
				small = numbers[i];
		}

		System.out.println("Largest Number is : " + large);
		System.out.println("Smallest Number is : " + small);
	}
}
