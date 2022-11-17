package com.chainsys.day4;

public class BookConstructors {

	String language;
	float price;
	String name;
	int rating;

	BookConstructors() {
		language = null;
		price = 0.0f;
		rating = 0;
	}

BookConstructors(String language,float price,int rating,String name){
	this.language=language;
	this.price=price;
	this.rating=rating;
	this.name=name;
}

}
