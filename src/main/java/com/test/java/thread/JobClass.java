/*
 * Created on Dec 27, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.java.thread;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class JobClass implements Job {

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Hi this is Daniyal Abbasi");
		Task tsk=new Task();
		/*Date d = new Date();
		Calendar cal = Calendar.getInstance();
		if (cal.get(Calendar.DAY_OF_WEEK) == 1
				|| cal.get(Calendar.DAY_OF_WEEK) == 7) {
			System.out.println("value of day " + cal.get(Calendar.DAY_OF_WEEK));
		} else {
			System.out.println("value of day " + cal.get(Calendar.DAY_OF_WEEK));
			new ReferenceDataService().sendPannoReimdNew();
		}
		new ReferenceDataService().checkPannoReimd();*/
	}
}
