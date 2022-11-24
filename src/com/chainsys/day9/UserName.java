package com.chainsys.day9;

public class UserName {

	public static void main(String[] args) throws InvalidAgeException {
int age=10;
if(age>18)
{
	System.out.println("Eligible");
}
else 
	throw new InvalidAgeException();
	}

}
