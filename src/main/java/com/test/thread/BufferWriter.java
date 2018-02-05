package com.test.thread;

public class BufferWriter extends Thread {

	public BufferWriter(IBuffer buffer, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public void stopWriting() {
		// TODO Auto-generated method stub
		System.out.println("Stop Writing");
	}

	@Override
	public void run(){
		System.out.println("Running");
	}
	
}
