package com.code_Method;
import java.util.*;
public class KrishnaMurti_Number {
	public void check(int num)
	{
		int sum=0;
 		int org_num=num;
		for(int i=1;num>0;i++)
		{
			int rem=num%10;
			    num=num/10;
			    int fact=1;
 			    for(int j=1;j<=rem;j++)
			    {
 			    	fact=fact*j;
 			    }
			    sum=sum+fact;
		}
		if(sum==org_num)
		{
			System.out.println("Is KrishnaMurti Number");
		}
		else
			System.out.println("Is Not KrishnaMurti Number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		KrishnaMurti_Number obj=new KrishnaMurti_Number();
		obj.check(num);

				

	}

}
