package com.chainsys.day4;

public class TestBookConstructor {

	public static void main(String[] args) {
		BookConstructors book = new BookConstructors();
		book.language = "Tamil";
		book.price=100.0f;
		book.rating=3;
		book.name="Wings of fire";
		System.out.println(book.language + book.name + book.price + book.rating);

		BookConstructors book1 = new BookConstructors("English", 45.0f, 2,"Ponniyin Selvan");
		System.out.println(book1.language);
		System.out.println(book1.price);
		System.out.println(book1.rating);
		System.out.println(book1.name);
	}

}
