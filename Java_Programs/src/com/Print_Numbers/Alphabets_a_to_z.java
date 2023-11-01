package com.Print_Numbers;

//5. Write a program to print all alphabets from a to z

public class Alphabets_a_to_z {
	public void print()
	{
		for(char ch='a';ch<='z';ch++)
		{
			System.out.print(ch+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabets_a_to_z obj=new Alphabets_a_to_z();
		obj.print();

	}

}
