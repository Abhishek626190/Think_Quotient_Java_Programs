package com.do_while_loop;

import java.util.Scanner;

public class use_do_while_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			  
			System.out.println("1.Area of Rectangle\n2. Area of Circle\n3. Area of Triangle\n4. Area Of Square\nEnter Your choice From above menu");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter Length:");
			       int l=sc.nextInt();
			       System.out.println("Enter Breadth:");
			       int b=sc.nextInt();
			       int rectangle=l*b;
				   System.out.println("Area of Rectanle is"+( rectangle ));break;
			case 2:System.out.println( "Enter radius:");
			       double r=sc.nextDouble();
			       System.out.println("Area of Circle is ="+(3.14*r*r));
			       break;
			case 4:System.out.println("Enter Side:");
			       double side=sc.nextDouble();
			       System.out.println("Area of Square is="+(side*side));
			       
			        break;
			case 3:System.out.println("Enter Length" );
			       double L=sc.nextDouble();
			       System.out.println("Enter Breadth" );
			       double B=sc.nextDouble();
			       System.out.println("Area of Triangle is="+(0.5*L*B));
	               break;
	               
           default:System.out.println("Invalid Input");
           break;
           
			}
			System.out.println("If you want to continue Press'Y'or'y' And if you want to exit Press'N'or'n'");
			ch=sc.next().charAt(0);

			
			
		}while(ch=='Y'||ch=='y');


	}

}
