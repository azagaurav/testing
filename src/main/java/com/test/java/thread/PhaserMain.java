package com.test.thread;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PhaserMain {
	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
        System.out.println("Starting......... " + startTime);
        //IBuffer buffer = new UglyBuffer();
        IBuffer buffer = new NeatBuffer();
        Set<BufferWriter> writers = initiateRandomWriters(buffer);
        BufferCleaner cleaner = initiateSingleCleaner(buffer);
        System.out.println("Size : "+buffer.size());
        try {
            Thread.currentThread().sleep(60000);    //sleep for 1s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Size : "+buffer.size());
        stopAllWorkers(writers);
        cleaner.stopCleanup();
        System.out.println("Stoping......... " + (System.currentTimeMillis()- startTime));
    }
 
    private static void stopAllWorkers(Set<BufferWriter> writers) {
        for (Thread writer : writers) {
            ((BufferWriter)writer).stopWriting();
        }
    }
 
    private static BufferCleaner initiateSingleCleaner(IBuffer buffer) {
        BufferCleaner cleaner = new BufferCleaner(buffer,"Cleaner");
        cleaner.start();
        return cleaner;
    }
 
    private static Set<BufferWriter> initiateRandomWriters(IBuffer buffer) {
        Set<BufferWriter> writers = new HashSet<BufferWriter>();
        Random random = new Random();
        BufferWriter writer;
        int writersCount = random.nextInt(12);
        if(writersCount == 0) writersCount =+ 4;     // At least 4 threads.
        for (int i = 0; i < writersCount; i++) {
            writer = new BufferWriter(buffer,"Writer" + i, "Value" + i);
            writers.add(writer);
            writer.start();
        }
        System.out.println("Total writers are: " + writers.size());
        return writers;
    }
}
