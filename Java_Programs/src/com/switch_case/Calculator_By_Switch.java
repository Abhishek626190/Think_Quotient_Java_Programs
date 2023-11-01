package com.switch_case;
import java.util.*;

public class Calculator_By_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two number in integer");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter your choice \n1.+\n2.-\n3.*\n4./\n5.%");
 		char choice=sc.next().charAt(0);
		switch(choice)
		{
		case('+'):System.out.println("The result is "+(num1+num2));
		break;
		
		case('1'):System.out.println("The result is "+(num1+num2));
		break;
		
		case('-'):System.out.println("The result is "+(num1-num2));
		break;
		
		case('2'):System.out.println("The result is "+(num1-num2));
        break;
		
		case('*'):System.out.println("The result is "+(num1*num2));
		break;
		
		case('3'):System.out.println("The result is "+(num1*num2));
        break;
		
		case('/'):System.out.println("The result is "+(num1/num2));
		break;
		
		case('4'):System.out.println("The result is "+(num1/num2));
        break;
        
		case('%'):System.out.println("The result is "+(num1%num2));
		break;
		
		case('5'):System.out.println("The result is "+(num1%num2));
        break;
		
		default:System.out.println("Invalid Input");
		break;
		}
	}

}
