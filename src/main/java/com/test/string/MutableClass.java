package com.test.string;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import jdk.nashorn.internal.ir.annotations.Immutable;

import com.test.bean.Contacts;

public class MutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacts c1 = new Contacts("Mani", "9650239588");
		System.out.println("NAME ::: " + c1.getName() + "  Mobile ::: "
				+ c1.getMobile());
		c1 = new Contacts("Gaurav", "9717031315");
		System.out.println("NAME ::: " + c1.getName() + "  Mobile ::: "
				+ c1.getMobile());
	}

	static boolean isImmutable(Contacts obj) {
		Class<?> objClass = obj.getClass();

		// Class of the object must be a direct child class of the required
		// class
		Class<?> superClass = objClass.getSuperclass();
		if (!Immutable.class.equals(superClass)) {
			return false;
		}

		// Class must be final
		if (!Modifier.isFinal(objClass.getModifiers())) {
			return false;
		}

		// Check all fields defined in the class for type and if they are final
		Field[] objFields = objClass.getDeclaredFields();
		for (int i = 0; i < objFields.length; i++) {
			if (!Modifier.isFinal(objFields[i].getModifiers())
					|| !isValidFieldType(objFields[i].getType())) {
				return false;
			}
		}

		// Lets hope we didn't forget something
		return true;
	}

	static boolean isValidFieldType(Class<?> type) {
		// Check for all allowed property types...
		return type.isPrimitive() || String.class.equals(type);
	}

}
