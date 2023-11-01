package com.do_while_loop;
import java.util.*;

public class menu_driven_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.println("Enter value of num1");
			int num1=sc.nextInt();
			System.out.println("Enter value of num1");
			int num2=sc.nextInt();
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter Your choice From above menu");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Addition"+(num1+num2));break;
			case 2:System.out.println("Subtraction"+(num1-num2));break;
			case 3:System.out.println("Multiplication"+(num1*num2));break;
			case 4:System.out.println("Division"+(num1/num2));break;
            default:System.out.println("Invalid Input");break;

			}
			System.out.println("If you want to continue Press'Y'or'y' And if you want to exit Press'N'or'n'");
			ch=sc.next().charAt(0);

			
			
		}while(ch=='Y'||ch=='y');

	}

}
