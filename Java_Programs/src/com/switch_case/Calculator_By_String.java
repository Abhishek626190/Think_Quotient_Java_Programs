package com.switch_case;
import java.util.*;
public class Calculator_By_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
		
		System.out.println("Add:\nSubtraction:\nMultiply:\nDivison:\nModulus:\nEnter your choice from above Menu:");
		String choice=sc.nextLine();
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		
		
		
		switch(choice)
		{
		case"Add":System.out.println("The addition is="+(num1+num2));break;
		case"Subtraction":System.out.println("The Subtraction is="+(num1-num2));break;
		case"Multiply":System.out.println("The Multiply is="+(num1*num2));break;
		case"Division":System.out.println("The Division is="+(num1/num2));break;
		case"Modulus":System.out.println("The Modulus is="+(num1%num2));break;
		default:System.out.println("Invalid Input");
 
		}
		System.out.println("For continue press'Y' or 'y' else print N");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		

	}

}
