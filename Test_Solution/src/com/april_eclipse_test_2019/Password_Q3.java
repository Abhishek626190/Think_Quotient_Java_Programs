package com.april_eclipse_test_2019;
/*
 * 3. Covert password to string ->[1M]
password is India'sAge72@2019
convert to UllllSlUllNNSNNNN -> U= Uppercase, l= lowercase, S=
Special case, N= Number
shorten above to ->U4lSlU2l2NS4N
 */
//import java.util.Arrays;
import java.util.Scanner;
public class Password_Q3 {
	
	public void passToString(String s)
	{
		char[] ch=s.toCharArray();
		System.out.println("Before Converting Password To String");
		System.out.println(s);
		//System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				ch[i]='U';
			}
			else if(Character.isLowerCase(ch[i]))
			{
				ch[i]='I';
			}
			else if(Character.isDigit(ch[i]))
			{
				ch[i]='N';
			}
			else
			{
				ch[i]='S';
			}
		}
		System.out.println("After Converting Password To String");
		String str=new String(ch);
		System.out.println(str);
 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Password");
		String password=sc.next();
		Password_Q3 obj=new Password_Q3();
		obj.passToString(password);
		
		

	}

}
