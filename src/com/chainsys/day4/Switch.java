package com.chainsys.day4;

public class Switch {

	public static void main(String[] args) {
		String programmingLanguage = "Java";
		switch (programmingLanguage) {
		case "Java": {
			System.out.println("Platform independent language");
			break;
		}
		case "HTML":
			System.out.println("Markup language");
			break;
		case "CSS":
			System.out.println("Gives look and feel");
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
