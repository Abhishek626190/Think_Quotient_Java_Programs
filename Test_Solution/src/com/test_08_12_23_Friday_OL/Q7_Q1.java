package com.test_08_12_23_Friday_OL;

import java.util.LinkedList;
import java.util.List;

public class Q7_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list1=new LinkedList<>();
		list1.add("Me");
		list1.add("You");
		list1.add("He");
		list1.add("She");
		list1.add("It");
		List<String>list2=new LinkedList<>();
		list2.add("You");
		list1.retainAll(list2);
		//System.out.println(list1);
		for(String temp:list1)
		{
			System.out.println(temp+" ");
		}



		

	}

}
