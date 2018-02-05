/*
 * Created on Jan 25, 2014
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.abstractclass;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class Circle extends Figure {
	private float radius;

	public double getArea() {
		return (3.14 * (radius * 2));
	}
}