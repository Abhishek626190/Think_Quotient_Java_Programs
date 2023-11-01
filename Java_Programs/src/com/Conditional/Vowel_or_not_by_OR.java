package com.Conditional;
import java.util.*;

public class Vowel_or_not_by_OR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='A')
		{
			System.out.println(ch+" is vowel");

		}
		else if(ch=='e'||ch=='E')
		{
			System.out.println(ch+" is vowel");

		}
		else if(ch=='i'||ch=='I')
		{
			System.out.println(ch+" is vowel");

		}
		else if(ch=='o'||ch=='O')
		{
			System.out.println(ch+" is vowel");

		}
		else if(ch=='u'||ch=='U')
		{
			System.out.println(ch+" is vowel");

		}
		else {
			System.out.println(ch+" is not vowel");
		}

		

	}

}
