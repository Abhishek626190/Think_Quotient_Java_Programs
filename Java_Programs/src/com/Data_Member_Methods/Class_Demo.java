package com.Data_Member_Methods;

class Class_Demo {
	int eid;
	String ename, desg, dname, addr, email;
	double salary;
	long cnum;
	boolean fts;

	public void setdata(int id, String name, String de, String dn, String add, String em, double sa, long mnum,
			boolean fs) {
		eid = id;
		ename = name;
		desg = de;
		dname = dn;
		addr = add;
		email = em;
		salary = sa;
		cnum = mnum;
		fts = fs;

	}

	public void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(desg);
		System.out.println(dname);
		System.out.println(addr);
		System.out.println(email);
		System.out.println(salary);
		System.out.println(cnum);
		System.out.println(fts);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_Demo obj = new Class_Demo();
		Class_Demo obj1 = new Class_Demo();

		obj.setdata(1, "Abhi", "hr", "sales", "pune", "raia@gmail.com", 6261904221l, 720000, true);
		obj.display();
		System.out.println("________________________________");
		obj.setdata(2, "Abhishek","manager","it","mumbai","raia8@gmail.com",  7509302866l, 8200000 , false);
		obj.display();
		System.out.println("________________________________");
 		obj1.setdata(0, null, null, null, null, null, 0, 0, false);
		obj1.display();
	}
}
