package com.Conditional;
import java.util.*;

public class Even_Odd_By_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated m-ethod stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        System.out.println("Enter your choice according to your requirement press:\n1.To check even number\n2.To check Odd number");
          int choice=sc.nextInt();
            switch(choice)
            {

        case(1):if(num%2==0)
                 {
        	      System.out.println(num+"Is Even Number");
                 }
                else
                 {
        	      System.out.println(num+"Is Not Even Number");
                 }
        break;
        
        case(2):if(num%2!=0)
                 {
        	      System.out.println(num+"Is Odd Number");
                 }
                else
                 {
        	      System.out.println(num+"Is Not Odd Number");
                 }
        break;
        default:System.out.println("Invalid Input");
        }
  }
}
//switch()
//{
//case(1):if(num%2==0)
//             {
//	           System.out.println(num+"is even number");
//             }
//       else
//           {
//              System.out.println(num+"is  not even number");
//           }
	
//}
//      



