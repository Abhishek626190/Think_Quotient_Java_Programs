package com.fileHandling;

//import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
//import java.io.File;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoManager {

 	FileOutputStream fout = null;
 	BufferedOutputStream bout = null;
	
	public  WriteIntoManager() throws FileNotFoundException {
		File f = new File("f://FileHandling//Hello.txt");
  		fout = new FileOutputStream(f);
		bout = new BufferedOutputStream(fout);
	}
	public void writeContents() throws IOException {
		System.out.println("Enter some data ..");

		int data = System.in.read();
		// System.out.println(data);
		while (data != 45) {
			bout.write(data);
			bout.flush();
			data = System.in.read();
		}
		System.out.println("contents written to file..");

	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
