package com.fileHandling;

import java.io.File;

public class CreateDirectoryDemo {

	public static void main(String[] args) {
		// Specify the path of the directory to be created
		String directoryPath = "f:/FileHandling";

		// Create a File object representing the directory
		File directory = new File(directoryPath);

		// Create the directory
		boolean isDirectoryCreated = directory.mkdir();

		if (isDirectoryCreated) {
			System.out.println("Directory created successfully.");
		} else {
			System.out.println("Failed to create directory.");
		}
	}
}
