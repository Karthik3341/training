package com.chainsys.day9;

public class ArrayException {

	public static void main(String[] args) {
		int[] rollNo = { 2, 4, 6, 8, 10, 15, 20 };
		for (int i = 0; i <= 6; i++) {
		}
		try {
			for (int i = 0; i <= 7; i++) {
				System.out.println(rollNo[i]);
			}
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} catch (ArrayIndexOutOfBoundsException arre) {
			System.out.println(arre.getMessage());
		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
