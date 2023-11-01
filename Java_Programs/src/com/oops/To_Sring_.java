package com.oops;

public class To_Sring_ {

	 
		static int counter = 100;
		private int id = counter;
		private String name;
		private float salary;

		To_Sring_() {
			this.id = counter++;
		}
		public String toString()
		{
			return "id:"+id+"name:"+name+"salary:"+salary;
		}
		public void setData(String name, float salary) {

			this.name = name;
			this.salary = salary;
		}

		public void displayData() {
			System.out.println("Id: " + (id) + " Name :" + name + " Salary " + salary);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			To_Sring_ obj1 = new To_Sring_();
			To_Sring_ obj2 = new To_Sring_();
			To_Sring_ obj3 = new To_Sring_();
//			obj3.toString();
			System.out.println(obj3);
			System.out.println(obj2);
			obj1.setData("Abhi", 15243f);
			obj2.setData("Abhishek", 15244f);
			obj3.setData("Abhinav", 15245f);
//			obj1.displayData();
//			obj2.displayData();
//			obj3.displayData();

		}

	}

