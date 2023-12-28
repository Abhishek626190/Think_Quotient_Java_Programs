package com.fileHandling;

import java.io.File;

public class ReadDirectoryContentExample {
	public static void main(String[] args) {
		// Specify the path of the directory to be read
		String directoryPath = "f:/Python_";

		// Create a File object representing the directory
		File directory = new File(directoryPath);

		// Check if the path represents a directory
		if (directory.isDirectory()) {
			// List the contents of the directory (names only)
			String[] files = directory.list();

			if (files != null) {
				System.out.println("Listing contents of the directory:");
				for (String file : files) {
					System.out.println(file);
				}
			} else {
				System.out.println("Failed to list directory contents.");
			}
		} else {
			System.out.println("The specified path is not a directory.");
		}
	}
}
