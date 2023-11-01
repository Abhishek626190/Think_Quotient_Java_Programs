package com.Assignments_Array_Object;
 
public class Department_Q3 {
	private int did;
	private String dname;
	 
	Department_Q3() {
		 
	}

	Department_Q3(int id, String name) {
		this.did = id;
		this.dname = name;

	}

	public void setDid(int id) {
		this.did = id;
	}

	public int getDid() {
		return did;
	}

	public void setDname(String name) {
		this.dname = name;
	}

	public String getDname() {
		return dname;
	}
	public boolean compareName(Department_Q3  n) {

		if (this.dname == n.dname ) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "Id:" + did + "\nName:" + dname;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Department_Q3 obj = new Department_Q3(1001, "Developer");
//		System.out.println(obj);
		//System.out.println(obj.compareName(new Department_Q3(1001,"Developer")));
		Department_Q3 darr[]=new Department_Q3[5];
		darr[0]=new Department_Q3(1002,"A");
		darr[1]=new Department_Q3(1003,"B");
		darr[2]=new Department_Q3(1004,"C");
		darr[3]=new Department_Q3(1005,"A");
		darr[4]=new Department_Q3(1006,"A");
		 for(int i=0;i<darr.length;i++)
		 {
			 for(int j=0;j<darr.length;j++)
			 {
				 if(i!=j&&darr[i].dname==darr[j].dname)
				 {
					System.out.println(darr[i]); 
				 }
			 }
		 }



	}

}
