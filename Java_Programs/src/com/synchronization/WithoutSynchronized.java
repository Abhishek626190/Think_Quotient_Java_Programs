package com.synchronization;

public class WithoutSynchronized implements Runnable {
	private Account_Class a1;
	private Thread t1, t2;

	WithoutSynchronized() {
		a1 = new Account_Class();
		t1 = new Thread(this, "Person_1");
		t2 = new Thread(this, "Person_2");
		t1.start();
		t2.start();

	}

	// without synchronization
//	public void run()
//	{
//		doTransaction();
//	}
	// with synchronization
	public void run() {
		synchronized (this) 
		{
			doTransaction();

		}
	}

	public void doTransaction() {
		System.out.println(Thread.currentThread().getName() + "IS checking the balance=" + a1.getBalance());
		a1.withdraw(4500);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutSynchronized obj = new WithoutSynchronized();
	}

}
