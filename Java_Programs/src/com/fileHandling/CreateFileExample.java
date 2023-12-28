package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        // Specify the path of the new file to be created
        String filePath = "f:/FileHandling/Hi.pdf";

        // Create a File object representing the new file
        File file = new File(filePath);

        try {
            // Create the new file
            boolean isFileCreated = file.createNewFile();

            if (isFileCreated) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists or failed to create.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}

