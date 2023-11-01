package com.Conditional;
import java.util.*;

public class Alphabet_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Valid Alphabet");
		char ch=sc.next().charAt(0);
		if(ch>'a'&&ch>'z')
		{
			System.out.println(ch+"is Alphabet");
		}
		else if(ch>'A'&&ch>'Z')
		{
			System.out.println(ch+"is Alphabet");
		}
		else
		{
			System.out.println(ch+"is  not Alphabet");

			
		}
		

	}

}
