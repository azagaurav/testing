package com.test.java.multithreading;

import java.util.Queue;

public class Producer extends Thread {
    private final Queue<Integer> sharedQ;

    public Producer(Queue<Integer> sharedQ) {
        super("Producer");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
    	sharedQ.add(11);
    	sharedQ.add(22);
    	sharedQ.add(33);
        for (int i = 0; i < 4; i++) {

            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() >= 1) {
                    try {
                    	System.out.println("Queue is full, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println	("producing : " + i);
                sharedQ.add(i);
                sharedQ.notify();
            }
        }
    }
}


