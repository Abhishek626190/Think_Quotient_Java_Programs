package com.Conditional;
import java.util.*;

public class Highest_placement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no students placed in CSE:");
		int CSE=sc.nextInt();
		System.out.println("Enter no students placed in ESE:");
		int ESE=sc.nextInt();
		System.out.println("Enter no students placed in MECH:");
		int MECH=sc.nextInt();
		
		if(CSE<0||MECH<0||ESE<0)
		{
			System.out.println("Inupt is invalid");
		}
		else if(CSE>MECH&&CSE>ESE)
		{
			System.out.println("Highest Placement:CSE");
		}
		else if(MECH>CSE&&MECH>ESE)//(MECH>ESE)
		{
			System.out.println("Highest Placement:MECH");
		}
		else if(ESE>MECH&&ESE>CSE)//(ESE>MECH)
		{
			System.out.println("Highest Placement:ESE");
		}
		else if(CSE==MECH&&CSE==ESE)
		{
			System.out.println(" None of the department has got the highest placement");
		}
		else if(CSE==MECH)
		{
			System.out.println("Highest Placments:\nCSE\nMECH");
		}
		else if(CSE==ESE)
		{
			System.out.println("Highest Placments:\nESE\nCSE");
		}

		else if(ESE==MECH)
		{
			System.out.println("Highest Placments:\nESE\nMECH");
		}



	}

}
