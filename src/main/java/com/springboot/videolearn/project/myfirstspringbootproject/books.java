package com.springboot.videolearn.project.myfirstspringbootproject;

public class books {
	
	long id;
	String bookName;
	String authorName;
	String price;
	
	public books(long id, String bookName, String authorName, String price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	
	public long getId() {
		return id;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "books [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + "]";
	}

}
