package com.String_Buffer;

public class Delete_SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str =new StringBuffer("Abhishek");
		str.delete(4, str.length());
		System.out.println(str+" "+str.length());
		str.delete(1, 2);
		System.out.println(str);
		
		

	}

}
