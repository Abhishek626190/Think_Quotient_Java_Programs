package com.switch_case;
import java.util.*;
public class check_vowel_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Alphabet To konw it is vowel or consonat");
	    char ch=sc.next().charAt(0);
	    switch(ch)
	    {
	    case'a':System.out.println(ch+" is vowel");break;
	    case'A':System.out.println(ch+" is vowel");break;
	    case'e':System.out.println(ch+" is vowel");break;
	    case'E':System.out.println(ch+" is vowel");break;
	    case'i':System.out.println(ch+" is vowel");break;
	    case'I':System.out.println(ch+" is vowel");break;
	    case'o':System.out.println(ch+" is vowel");break;
	    case'O':System.out.println(ch+" is vowel");break;
	    case'u':System.out.println(ch+" is vowel");break;
	    case'U':System.out.println(ch+" is vowel");break;
	    default: if(ch>='a'&&ch<'z')
	    	       System.out.println(ch+" is Consonant");
	            else if(ch>='A'&&ch<'Z')
	    	       System.out.println(ch+" is Consonant");
	            else
	            	System.out.println("Invalid Input");

	     
	    }
	
	}
	
	
	

}
