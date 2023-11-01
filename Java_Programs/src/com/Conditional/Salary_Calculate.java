package com.Conditional;
import java.util.*;

public class Salary_Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter your Salary In Numbers");
       int salary=sc.nextInt();
       int Gross_Salary;
       if(salary<=10000)
       {
    	   Gross_Salary=salary+((salary*20)/100)+((salary*80)/100);
    	   System.out.println("Your Gross Salary Is="+salary);
    	   System.out.println("Your Gross Salary Is="+Gross_Salary);
       }
       else if(salary<=20000)
       {
    	   Gross_Salary=salary+((salary*25)/100)+((salary*90)/100);
    	   System.out.println("Your Gross Salary Is="+salary);
    	   System.out.println("Your Gross Salary Is="+Gross_Salary);
       }
       else if(salary>20000)
       {
    	   Gross_Salary=salary+((salary*30)/100)+((salary*95)/100);
    	   System.out.println("Your Gross Salary Is="+salary);
           System.out.println("Your Gross Salary Is="+Gross_Salary);
       }

	}

}
