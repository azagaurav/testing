package com.test.thread;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Phaser;

public class BetterBuffer implements IBuffer {
    private final Phaser phaser = new Phaser(1); // One party to arrive.
    private final Queue<String> bufferMemory = new ConcurrentLinkedQueue<String>();
 
    public void write(String value){
        int phase = phaser.getPhase();
        phaser.awaitAdvance(phase);
        // Writes are green to go now.
        bufferMemory.add(value);
        System.out.println("Value added: " + value);
    }
 
    public void cleanUp() {
        while(!bufferMemory.isEmpty()){
            String item = bufferMemory.remove();
            System.out.println("Removed: " + item);
        }
        System.out.println("Clean up over");
        phaser.arrive();
    }
 
    public int size() {
        return bufferMemory.size();
    }
}
