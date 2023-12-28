package com.fileHandling;

import java.io.File;

public class FileHandlingDemo {

	public void demo()
	{
		File f=new File("f://Python_//Python_Notes");
		System.out.println("File Name:"+f.getName());
		System.out.println("File Path:"+f.getPath());
		System.out.println("File Absolute Path:"+f.getAbsolutePath());
		System.out.println("File Parent:"+f.getParent());
		System.out.println(f.exists()?"File Exists":"File Not Exists");
		System.out.println(f.canWrite()?"Can Writeable":"Cannot Writeable");
		System.out.println(f.canRead()?"can read":"can not read");
		System.out.println(f.isDirectory()?"IS directory":"is not directory");
		System.out.println(f.isFile()?"is file":"is not file");
		System.out.println(f.isAbsolute()?"is absolute":"is not absolute");
		System.out.println("File Last Modified:"+f.lastModified());
		System.out.println("File Length "+f.length());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileHandlingDemo obj=new FileHandlingDemo();
		obj.demo();

	}

}
