package com.chainsys.day6;

public class BookTestMethod {
	int bookId;
	String name;
	float price;
	int rating;
	String language;

	public void sharingReview(String bookName) {
		if (bookName.trim().length()>1) {
			System.out.println("Worth to read,4*");
		} else {
			System.out.println("Invalid book name");
		}
	}
}
