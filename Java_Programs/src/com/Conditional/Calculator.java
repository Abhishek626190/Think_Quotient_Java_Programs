package com.Conditional;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice \n1.Add\n2.Subtract\n3.Multiply\n4.Division\n5.Modulus");
        int choice=sc.nextInt();
        System.out.println("Enter Two Numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result;
        
        if(choice==1)
        {
        	result=num1+num2;
        	System.out.println("The Addition is="+result);  
        }
        else if(choice==2)
        {
        	result=num1-num2;
        	System.out.println("The Subtraction is="+result);  
        }
        else if(choice==3)
        {
        	result=num1*num2;
        	System.out.println("The Multiplication is="+result);  
        }
        else if(choice==4)
        {
        	result=num1/num2;
        	System.out.println("The Divison is="+result);  
        }
        else if(choice==5)
        {
        	result=num1%num2;
        	System.out.println("The Modulus is="+result);  
        }
        
        
	}

}
