package com.Data_Member_Methods;

public class Class_Demo4 {

	int rolln, sub1, sub2, sub3, sub4, sub5;
	String name, email;
	char grade;
	long contact;
	//float per;
	float per1;

	public void set(int rn, String na, String mail, long cn, float per ) {
		rolln = rn;
		name = na; 
		email = mail;
		contact = cn;
		per1=per;
 	}

	public void display() {
		System.out.println("Roll_No:"+rolln);
		System.out.println("Name:"+name);
		System.out.println("E_Mail:"+email);
		System.out.println("Moblie_Number:"+contact);
		System.out.println("Marks Of 1st Subject:"+sub1);
		System.out.println("Marks Of 2nd Subject:"+sub2);
		System.out.println("Marks Of 3rd Subject:"+sub3);
		System.out.println("Marks Of 4th Subject:"+sub4);
		System.out.println("Marks Of 5th Subject:"+sub5);
 		System.out.println("Grade:"+grade);
		System.out.println("Percnetage:"+per1);
 	}

	public float percentage(int subj1, int subj2, int subj3, int subj4, int subj5) {
 		sub1 = subj1;
		sub2 = subj2;
		sub3 = subj3;
		sub4 = subj4;
		sub5 = subj5;
 		int sum = sub1 + sub2 + sub3 + sub4 + sub5;
		per1 = sum / 5;
 		return per1;
	}

	public void grade( ) {
		if (per1 > 90)
			grade='A';
 		else if (per1 > 80)
 			grade='B';
 		else if (per1 > 70)
			grade='C';
		else if (per1 > 60)
			grade='D';
		else if (per1 > 50)
			grade='E';
		else
			System.out.println("Oops you are fail Better Luck Next Time");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_Demo4 obj = new Class_Demo4();
		obj.set(101, "Abhi", "abhi@gmail.com", 6261904221l, obj.percentage(80, 90, 70,85,75));
 		obj.grade();
		obj.display();
		
	}

}
