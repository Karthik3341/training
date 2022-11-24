package com.chainsys.day8;

import java.util.Arrays;

public class ArraySample {

	public static void main(String[] args) {
		int[] mobileNumber = { 1234, 2345, 3456, 4567, 5678, 6789, 7890 };
		Arrays.sort(mobileNumber);
		for (int i = 0; i < mobileNumber.length; i++) {
			System.out.println(mobileNumber[i]);
			{
				System.out.println(mobileNumber);
			}
		}
	}
}
