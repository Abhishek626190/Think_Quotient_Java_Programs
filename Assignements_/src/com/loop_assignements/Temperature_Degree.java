package com.loop_assignements;

//The temperature of a chemical is 100 degree celsius. 
//Every hour the temperature drops by 7 degrees. Display the hours till the temperature drops below 60 degrees
public class Temperature_Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int degree = 100;
		int i;
		for ( i=1; degree > 60; i++) {
			degree = degree - 7;
			if(degree>60)
				System.out.println("After " +i+" hours temperature is "+degree+" celsius");
			else 
				System.out.println("After "+i+" hours temperature is  below 60 degree celsius");
		}
		
		

	}

}
