package com.loop_assignements;
//4. WAP to show the use of break statement ( in for loop)
public class Show_use_of_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;;i++)
		{
			if(i==5)
			{
				System.out.println("Break used");
				break;
			}
			System.out.println(i);

		}

	}

}
