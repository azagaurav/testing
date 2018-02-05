package com.test.thread;

public class ThreadMain {

	public static void main(String[] str) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();
		DaemonThread dt = new DaemonThread();
		System.out.println(dt.getPriority());
		System.out.println("t1 thread priority : " + t1.getPriority()); // Default
																		// 5
		System.out.println("t2 thread priority : " + t2.getPriority()); // Default
																		// 5
		System.out.println("t3 thread priority : " + t3.getPriority()); // Default
																		// 5

		//t1.setPriority(8);
		t2.setPriority(5);
		t3.setPriority(1);
		
		// t3.setPriority(21); will throw IllegalArgumentException
		System.out.println("t1 thread priority : " + t1.getPriority()); // 2
		System.out.println("t2 thread priority : " + t2.getPriority()); // 5
		System.out.println("t3 thread priority : " + t3.getPriority());// 8

		// Main thread
		System.out.print(Thread.currentThread().getName());
		System.out.println("Main thread priority : "
				+ Thread.currentThread().getPriority());

		// Main thread priority is set to 10
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority : "
				+ Thread.currentThread().getPriority());
	}

}
