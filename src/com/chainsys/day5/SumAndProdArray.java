package com.chainsys.day5;

import java.util.Scanner;

public class SumAndProdArray {

	public static void main(String[] args) {
		int sum = 0, prod = 1, a[], num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array:");
		num = sc.nextInt();
		a = new int[num];
		System.out.println("Enter the elements:");
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the " + (i + 1) + " element:");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			sum = sum + a[i];
			prod = prod * a[i];
		}
		System.out.println("Sum of array elements is: " + sum);
		System.out.println("Product of array elements is: " + prod);
	}

}
