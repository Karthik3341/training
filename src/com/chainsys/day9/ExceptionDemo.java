package com.chainsys.day9;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10, b = 0;
		try {
			int divideByZero = a / b;
			System.out.println(divideByZero);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException=>" + e.getMessage());
		} finally {
			System.out.println("This is the finally block");
		}
	}

}
