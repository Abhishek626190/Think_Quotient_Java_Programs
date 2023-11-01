package com.switch_case;
import java.util.*;

public class Display_number_to_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number b/w 1to5 to display in Word");
       int num=sc.nextInt();
       switch(num)
       {
       case 1:System.out.println("One");break;
       case 2:System.out.println("Two");break;
       case 3:System.out.println("Three");break;
       case 4:System.out.println("Four");break;
       case 5:System.out.println("Five");break;
       default:System.out.println("Invalid Input");break;
       
       
       }
	}

}
