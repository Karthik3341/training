package com.chainsys.day9;

public class DataLengthException {

	public static void main(String[] args) throws InvalidUserDataLengthException {
		int no1 = 15, no2 = 10, no3 = 5;
		String name = "Gokul", mailId = "gokul@gmail.com";
		try {
			int result = no1 + no2;
			System.out.println(result);
			int avg = result / no3;
			System.out.println(avg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (name.length() < 5)
			throw new InvalidUserDataLengthException();
		if (mailId.length() < 7)
			throw new InvalidUserDataLengthException();
	}
}
