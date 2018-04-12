/*
 * Created on Dec 26, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.java.thread;

import java.util.TimerTask;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */


	class Task extends TimerTask {
	    int count = 1;
	    // run is a abstract method that defines task performed at scheduled time.
	    public void run() {
	        System.out.println(count+" : Mahendra Singh");
	        count++;
	    }
	}

