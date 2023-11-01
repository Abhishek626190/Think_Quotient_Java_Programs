package com.loops;

public class Display_1to20__2and9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++)
		{
			if(i%2==0&&i%9==0)
			{
				System.out.println("Stop Displaying because Number is divisible by 2&9");
				break;
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
