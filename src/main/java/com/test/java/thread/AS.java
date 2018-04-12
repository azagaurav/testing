package com.test.java.thread;

class PrintJob implements Runnable {
	String name;

	PrintJob(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " Job Started by Thread "
				+ Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + " Job Started by Thread "
				+ Thread.currentThread().getName());

	}
}
