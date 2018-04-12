package com.test.java.thread;

class Display{
	public static synchronized void wish(String name){
		for(int i=0;i<10;i++){
			System.out.print("Happy Birthday : ");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}			
			System.out.println(name);
		}
	}
}
class HappyBirthdayWithThread extends Thread{
	Display d;
	String name;
	HappyBirthdayWithThread(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);		
	}	
}
public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1 = new Display();
		Display d2 = new Display();
		HappyBirthdayWithThread t1 = new HappyBirthdayWithThread(d1, "Munesh");
		HappyBirthdayWithThread t2 = new HappyBirthdayWithThread(d2, "Sushil");
		t1.start();
		t2.start();
	}

}
