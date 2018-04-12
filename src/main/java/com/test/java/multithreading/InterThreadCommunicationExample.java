package com.test.java.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommunicationExample {

    public static void main(String args[]) {

        final Queue<Integer> sharedQ = new LinkedList<Integer>();

        Thread producer = new Producer(sharedQ);
        Thread consumer1 = new Consumer1(sharedQ);
        Thread consumer2 = new Consumer2(sharedQ);

        producer.start();
        consumer1.start();
        consumer2.start();

    }
}

