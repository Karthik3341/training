package com.chainsys.day6;

public class BookTestMethod1 {

	public static void main(String[] args) {
		BookTestMethod book = new BookTestMethod();
		book.bookId = 23;
		book.language = "Tamil";
		book.name = "Thirukkural";
		book.price = 500.0f;
		book.rating = 5;
		String bookName="";
		book.sharingReview(bookName);
	}

}
