package com.chainsys.day5;

import java.util.Scanner;

public class SumOfIntLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of integer is =" + sum);
	}

}
