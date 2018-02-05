package com.test.design.patterns.sigleton;

import java.io.Serializable;

public class SerializationBreakSingleton implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final SerializationBreakSingleton sbs = new SerializationBreakSingleton();
	private SerializationBreakSingleton(){
		super();
	}
	public static SerializationBreakSingleton getSerializationBreakSingleton(){
		return sbs;
	}
	protected Object readResolve(){
		return SerializationBreakSingleton.getSerializationBreakSingleton();
	}

}
