package com.switch_case;

import java.util.Scanner;

public class Menu_Driven_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  
			System.out.println("1.Area of Rectangle\n2.Area of Circle\n3.Area of Triangle\n4.Area Of Square\n5.Circumference of a circle \n6.Perimeter of a square \n7.Area of a right angled triangle \n\nEnter Your choice From above menu:");
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
			case 3:System.out.println("Enter Height" );
			       double H=sc.nextDouble();
			       System.out.println("Enter Base" );
			       double B=sc.nextDouble();
			       System.out.println("Area of Triangle is="+(0.5*H*B));
	               break;
			case 5:System.out.println("Enter radius");
			       double radius=sc.nextDouble();
			       System.out.println("Circufernce Of Circle is="+(2*3.14*radius));
	               break;
			case 6:System.out.println("Enter  Side");
		           double   s=sc.nextDouble();
		           System.out.println("Circufernce Of Circle is="+(4*s));
                   break;
			case 7: System.out.println("Enter  Height" );
		       double height=sc.nextDouble();
		       System.out.println("Enter Base" );
		       double base=sc.nextDouble();
		       System.out.println("Area of Right Angled Triangle is="+(0.5*height*base));
          
			default:System.out.println("Invalid Input");
            break;
			}
           

	}

}
