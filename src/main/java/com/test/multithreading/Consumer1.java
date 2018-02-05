package com.test.multithreading;

import java.util.Queue;

public class Consumer1 extends Thread {
    private final Queue<Integer> sharedQ;

    public Consumer1(Queue<Integer> sharedQ) {
        super("Consumer1");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        while(true) {

            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() == 0) {
                    try {
                    	System.out.println("Queue is empty, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                Integer number = sharedQ.poll();
                System.out.println("consuming1 : " + number );
                sharedQ.notify();
              
				// termination condition
				if (number == 3) {
					System.out.println("Consumer1 terminate");
					break;
				}
            }
        }
    }
}
