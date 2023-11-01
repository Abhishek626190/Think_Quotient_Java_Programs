package com.Conditional;
import java.util.*;
public class Diplay_number_1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to display number from 1 to 5");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:System.out.println("1\n2\n3\n4\n5");
		break; 
		default:System.out.println("Wrong Key Pressed");
		}
	}

}
