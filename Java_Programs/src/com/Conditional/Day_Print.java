package com.Conditional;
import java.util.*;

public class Day_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number from 1 to 7 to know day of  a week");
        int num=sc.nextInt();
        if(num==1)
        {
        	System.out.println("The day is Monday");
        }
        else if(num==2)
        {
        	System.out.println("The day is Tuesday");
        }
        else if(num==3)
        {
        	System.out.println("The day is  Wednesday");
        }
        else if(num==4)
        {
        	System.out.println("The day is Thursday");
        }
        else if(num==5)
        {
        	System.out.println("The day is Friday");
        }
        else if(num==6)
        {
        	System.out.println("The day is Saturday");
        }
        else if(num==7)
        {
        	System.out.println("The day is Sunday");
        }
        else
        {
        	System.out.println("Ufff...Not a valid number");
        }
	}

}
