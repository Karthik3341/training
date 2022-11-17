package com.chainsys.day4;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollNo[] = null;
		String[] name = { "Gokul", "Ruthra" };
		int age[] = new int[10];
		age[0] = 6;
		age[1] = 12;
		age[2] = 18;
		for (int i = 0; i < age.length; i++) {
			for (String j : name) {
				System.out.println(j);
			}
		}
		for (int i = 0; i < 3; i++) {
		}
		int phoneNumber[] = { 678, 123, 1456, 23556 };
		{
			System.out.println("Length of Array:" + phoneNumber.length);
			for (int i = 0; i < phoneNumber.length; i++) {
			}
		}
	}
//System.out.println(age[0]+"\n"+age[1]+"\n"+age[2]);
}
