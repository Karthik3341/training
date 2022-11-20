package com.chainsys.day5;

public class ReverseOrderArray {
	public static void main(String[] args) {
		Integer[] array = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		System.out.println("Original Array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println("\n" + "Array in reverse order:");
		for (int i1 = array.length - 1; i1 >= 0; i1--) {
			System.out.print(array[i1] + "  ");
		}
	}
}
