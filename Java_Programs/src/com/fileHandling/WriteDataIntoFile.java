package com.fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteDataIntoFile {

	public void write() throws IOException {
		String s = "Java Is One Of The Best OOPS Programming Language";
		FileOutputStream fos = new FileOutputStream("f://FileHandling//Hello.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println(s);
		System.out.println("Object Saved");

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteDataIntoFile obj=new WriteDataIntoFile();
		obj.write();

	}

}
