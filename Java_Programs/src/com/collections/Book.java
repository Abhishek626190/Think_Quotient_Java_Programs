package com.collections;

public class Book {
	int bookId;
	String bookName;
	String bookAuthor;
	float price;
	
 	public Book(int bookId, String bookName, String bookAuthor, float price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}
 	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "\nBook [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", price=" + price
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
