/*
 * Created on Dec 26, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.thread;

import java.text.ParseException;
import java.util.Date;
import java.util.Timer;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

class Interval {

	   public static void main(String[] args) throws SchedulerException, ParseException {
	      /* Timer timer = new Timer();
	       // Schedule to run after every 3 second(3000 millisecond)
	       timer.scheduleAtFixedRate( new Task(), 3000,5000);  
	       timer.scheduleAtFixedRate(new Task(),new Date(),5000);*/
	   	System.out.println("GAURAV");
	       SchedulerFactory sf = new StdSchedulerFactory();
	       System.out.println("22");
			Scheduler sched = sf.getScheduler();
			System.out.println("21");
			JobDetail job = new JobDetail("job1", "group1", JobClass.class);
			System.out.println("2");
			String cronExpresion ="0 * 16 ? * *";//"1 1 1 ? * *";//"0 0/1 * * * ?";//"1 1 1 ? *
												 // *";//"0 0/1 * * * ?";//"1 1
												 // 1 ? * *";
			System.out.println("3");
			CronTrigger trigger = new CronTrigger("trigger1", "group1",	cronExpresion);
			System.out.println("4");
			//trigger.setStartTime(new Date());
			sched.scheduleJob(job, trigger);
			System.out.println("6");
			sched.start();
	   }
	}
