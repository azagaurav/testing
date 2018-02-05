/*
 * Created on Jun 6, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GenerateId {
	public static void  main(String [] arg){
		int i=0;
		String date="d";
		Collection clsId=new ArrayList();
		for(i=0;i<3;i++){
			DaysId di=new DaysId();
			for(int j=0;j<32;j++){			
				date="d"+i+j;
				String dse="cv";			
			}
			clsId.add(date);
			System.out.print("y "+date);
		}
		
		
	}
}
