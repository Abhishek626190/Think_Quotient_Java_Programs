package com.multithreading;

public class DemoThreadClass extends Thread{
		@Override
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i+":"+currentThread().getName());
			}
			
		}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DemoThreadClass t=new DemoThreadClass();
		t.setName("Thread_1");
		t.setPriority(MAX_PRIORITY);
		System.out.println(t);
		t.start();
		t.join();
		System.out.println(t.isAlive());
		DemoThreadClass t1=new DemoThreadClass();
		t1.setName("Thread_2");
		t1.setPriority(MIN_PRIORITY);
		System.out.println(t1);
 		t1.start();
 		//t1.join();
		System.out.println(t1.isAlive());

	}

}
