package com.Conditional;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a charcater");
		char ch=sc.next().charAt(0);
		if(ch=='a')
		{
			System.out.println("a is vowel");
		}
		else if(ch=='e')
		{
		System.out.println("b is vowel");
		}
		else if(ch=='i')
		{
		System.out.println("i is vowel");
		}
		else if(ch=='o')
		{
		System.out.println("o is vowel");
		}
		else if(ch=='u')
		{
		System.out.println("u is vowel");
		}
		else if(ch=='A')
		{
		System.out.println("A is vowel");
		}
		else if(ch=='E')
		{
		System.out.println("E is vowel");
		}
		else if(ch=='O')
		{
		System.out.println("O is vowel");
		}
		else if(ch=='U')
		{
		System.out.println("U is vowel");
		}
		else if(ch=='I')
			System.out.println("I is vowel");
		else
		{
	     System.out.println("The "+ch+""+" character is Constant");
		}

	}

}