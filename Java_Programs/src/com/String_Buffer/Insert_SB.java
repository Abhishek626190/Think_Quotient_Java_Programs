package com.String_Buffer;

public class Insert_SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("Abhishek");
		str.insert(8,"Rai");
		System.out.println(str.length()+" "+str);
		str.insert(11,"MCA");
		System.out.println(str.length()+" "+str);

	}

}
