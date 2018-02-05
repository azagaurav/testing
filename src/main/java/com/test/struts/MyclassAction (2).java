/*
 * Created on 18 Sep, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.struts;
import com.test.struts.*;
/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MyclassAction extends ZATSAction {

	public static void main(String[] args) {
		
	}

	/* (non-Javadoc)
	 * @see com.test.struts.ZATSAction#doExecute(com.test.struts.ActionMapping)
	 */
	public ActionForward doExecute(ActionMapping mapping) {
		// TODO Auto-generated method stub
		
		return mapping.findForword("Str");
	}

	
}
