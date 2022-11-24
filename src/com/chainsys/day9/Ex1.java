package com.chainsys.day9;

public class Ex1 {

	public static void main(String[] args) {
		int no1 = 15, no2 = 10, no3 = 5;
		try {
			int result = no1 + no2;
			System.out.println(result);
			int avg = result / no3;
			System.out.println(avg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
