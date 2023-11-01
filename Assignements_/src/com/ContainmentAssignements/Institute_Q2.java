package com.ContainmentAssignements;

public class Institute_Q2 {
	private int id;
	private String name;
	Branch_Q2 b;
	Subject_Q2 s;
	Topic_Q2 t;
	Sub_Topic_Q2 st;
	Question_Q2 q;

	Institute_Q2() {

	}

	Institute_Q2(int id, String name, Branch_Q2 b, Subject_Q2 s, Topic_Q2 t, Sub_Topic_Q2 st, Question_Q2 q) {
		this.id = id;
		this.name = name;
		this.b = b;
		this.s = s;
		this.t = t;
		this.st = st;
		this.q = q;

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Institute_Detatils:\nId:" + id + "\nName:" + name + "\n\nBranch_Detatils:\n" + b
				+ "\n\nTopic_Detatils:\n" + t + "\n\nSub_Topic_Detatils:\n" + st + "\n\nQuestions_Detatils:\n" + q;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch_Q2 obj2 = new Branch_Q2(201, "MCA");
		Subject_Q2 obj3 = new Subject_Q2(301, "JAVA");
		Topic_Q2 obj4 = new Topic_Q2(401, "Exception");
		Sub_Topic_Q2 obj5 = new Sub_Topic_Q2(501, "I/O Exception");
		Question_Q2 obj6 = new Question_Q2(601, "Objective Questions");

		Institute_Q2 obj1 = new Institute_Q2(101, "Think_Quotient", obj2, obj3, obj4, obj5, obj6);
		System.out.println(obj1);

	}

}
