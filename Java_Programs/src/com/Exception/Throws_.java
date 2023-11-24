package com.Exception;

import java.io.IOException;

public class Throws_ {
	public void show() throws Exception, ArrayIndexOutOfBoundsException {
		System.out.println("I am in show of throws");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Throws_1 extends Throws_ {
	public void show() throws IOException, NullPointerException {
		// super.show();
		System.out.println("I am in show of Throws_1");
	}
}
