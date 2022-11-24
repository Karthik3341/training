package com.chainsys.day6;

public class calculator {

	public static void main(String[] args) {
addition();
difference();
product();
division();
	}
public static void addition() {
	int i=15,j=-10;
	int sum=i+j;
	System.out.println("sum:"+sum);
}
public static void difference() {
	int i=10,j=-15;
	int diff=j-i;
	System.out.println("diff:"+diff);
}
public static void product() {
	int i=20,j=10;
	int prod=i*j;
	System.out.println("multiplication:"+prod);
}
public static void division() {
	{
		int i=10,j=20;
		int div=i/j;
		System.out.println("Division:"+div);
	}
}
}
