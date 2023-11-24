package com.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AuthorWise {
	ArrayList<Book> bookList = new ArrayList<>(Arrays.asList());

	AuthorWise(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public void countFrequency(ArrayList<Book> bl) {
		for (int i = 0; i < bl.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < bl.size(); j++) {
				if (bl.get(i).bookAuthor.equals(bl.get(j).bookAuthor)) {
					count++;
				}
			}
			if (count >= 0) {
				boolean isNotChecked = true;
				for (int k = i - 1; k >= 0; k--) {
					if (bl.get(k).bookAuthor.equals(bl.get(i).bookAuthor)) {
						isNotChecked = false;
					}
				}
				if (isNotChecked) {
					System.out.println(bl.get(i).bookAuthor + " " + (count + 1) + " Books");
				}
			}
		}
	}
 	public void countFrequency1(ArrayList<Book> bl) {
		int count = 0;
		for (int i = 0; i < bl.size(); i++) {
			count = 0;
			for (int j = 0; j < bl.size(); j++) {
				if (bl.get(i).bookAuthor.equals(bl.get(j).bookAuthor) && j < i)
					break;
				else if (bl.get(i).bookAuthor.equals(bl.get(j).bookAuthor))
					count++;

			}
			if (count > 0)
				System.out.println(bl.get(i).bookAuthor + "=" + count + " Books");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bookList = new ArrayList<>(Arrays.asList());
		bookList.add(new Book(101, "C", "BalaGuruSwami", 600.0f));
		bookList.add(new Book(102, "Python", "WanderWose", 800.0f));
		bookList.add(new Book(103, "C#", "WanderWose", 500.0f));
		bookList.add(new Book(104, "Java", "WanderWose", 1100.0f));
		bookList.add(new Book(105, "C++", "BalaGuruSwami", 700.0f));
		AuthorWise obj = new AuthorWise(bookList);
		System.out.println(bookList + "\n");
		obj.countFrequency1(bookList);
		obj.countFrequency(bookList);

	}

}
