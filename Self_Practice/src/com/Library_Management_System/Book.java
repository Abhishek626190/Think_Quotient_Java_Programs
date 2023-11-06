package com.Library_Management_System;

public class Book {
	private String author, title;
	private int isbn, genre, publicationYear, numberOfCopy;

	Book() {
		this.isbn = 0;
		this.author = "";
		this.title = "";
		this.genre = 0;
		this.publicationYear = 0;
		this.numberOfCopy = 0;

	}

	Book(int i, String a, String t, int g, int y, int c) {
		this.isbn = i;
		this.author = a;
		this.title = t;
		this.genre = g;
		this.publicationYear = y;
		this.numberOfCopy = c;

	}

	public void setIsbn(int i) {
		this.isbn = i;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setAuthor(String i) {
		this.author = i;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String i) {
		this.title = i;
	}

	public String getTitle() {
		return title;
	}

	public void setPublicationYear(int i) {
		this.publicationYear = i;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setGenre(int i) {
		this.genre = i;
	}

	public int getGenre() {
		return genre;
	}

	public void setNumberOfCopy(int i) {
		this.numberOfCopy = i;
	}

	public int getNumberOfCopy() {
		return numberOfCopy;
	}

	public String toString() {
		return "\nISBN:" + isbn + " Title:" + title + " Author:" + author + " Publication Year:" + publicationYear
				+ " Generation:" + genre + " Number Of Copies Available:" + numberOfCopy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book();

		Book obj1 = new Book(786, "Arjit", "Love", 10, 2019, 5);
		Book obj2 = new Book(380, "Ravindra", "Hate", 15, 2015, 8);
		Book obj3 = new Book(144, "Abdul", "Fear", 20, 2011, 11);
		System.out.println(obj1 + " ");
		System.out.println(obj2 + " ");
		System.out.println(obj3 + " ");

	}

}
