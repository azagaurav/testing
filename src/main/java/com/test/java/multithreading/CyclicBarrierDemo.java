package com.test.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CyclicBarrierDemo {
	
	public static void main(String [] args){
		final CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("All parties are arrived at barrier, lets play");
				
			}
		});
		
		Thread serviceInit = new Thread(new Task(cyclicBarrier), "Init Service");
		Thread serviceStart = new Thread(new Task(cyclicBarrier), "Start Service");
		Thread serviceValidate = new Thread(new Task(cyclicBarrier), "Validate Service");
		
		serviceInit.start();
		serviceStart.start();
		serviceValidate.start();
		
		
		
	}
	public static class Task implements Runnable{
		
		private CyclicBarrier cyclicBarrier;
		
		public Task(CyclicBarrier cyclicBarrier){
			this.cyclicBarrier = cyclicBarrier;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			try {
				System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
	            cyclicBarrier.await();
	            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
			} catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				Logger.getLogger(CyclicBarrierDemo.class.getName()).log(Level.SEVERE, null, e);
				e.printStackTrace();
			}
		}

	}

}
