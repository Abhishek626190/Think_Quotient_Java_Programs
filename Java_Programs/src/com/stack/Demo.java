package com.stack;

import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Stack<Integer>st=new Stack<>();
		st.push(15);
		st.push(18);
		st.push(81);
		st.push(95);
		st.push(45);
		//System.out.println(st);
//		st.pop();
//		System.out.println(st);
//		st.remove(1);
//		System.out.println(st);
		System.out.println(st.search(15));
		
		

	}

}
