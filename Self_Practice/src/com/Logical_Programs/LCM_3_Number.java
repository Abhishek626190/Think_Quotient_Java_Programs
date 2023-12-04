package com.Logical_Programs;
import java.util.Scanner;
public class LCM_3_Number {
 	  
	public void findLcm(int a, int b,int c) {
			 int lcm;
			 if(a>b&&a>c)
				 lcm=a;
			 else if(b>a&&b>c)
				 lcm=b;
			 else
				 lcm=c;
			 for(int i=1;;i++)
			 {
				 if(lcm%a==0&&lcm%b==0&&lcm%c==0)
				 {
					 System.out.println("LCM of "+a+","+b+" and "+c+" is "+lcm);
					 break;
				 }
				 lcm++;
			 }
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Numbers to find lcm");
			System.out.println("Enter First number");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Number");
			int num2 = sc.nextInt();
			System.out.println("Enter Third Number");
			int num3 = sc.nextInt();
			LCM_3_Number obj = new LCM_3_Number();
			obj.findLcm(num1,num2,num3);

		}

	}



