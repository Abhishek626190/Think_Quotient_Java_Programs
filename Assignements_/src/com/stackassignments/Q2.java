package com.stackassignments;

import java.util.Iterator;
import java.util.Stack;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>st=new Stack<>();
		st.push("Green");
		st.push("Blue");
		st.push("Black");
		st.push("Yellow");
		st.push("Violet");
		Iterator<String>itr=st.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		


	}

}
