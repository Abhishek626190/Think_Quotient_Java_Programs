package com.multithreading;

public class RunnableDemo implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + ":" + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable t = new RunnableDemo();
		Thread t1 = new Thread(new RunnableDemo(),"Pong");
		Thread t2=new Thread(t,"Ping");
		t1.start();
		//t1.setName("Thread_1");
		t2.start();
		//t2.setName("Thread_2");


	}

}
