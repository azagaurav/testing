package com.test.java.string;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.test.java.bean.Address;
import com.test.java.bean.Contacts;

import jdk.nashorn.internal.ir.annotations.Immutable;

@SuppressWarnings("restriction")
public class MutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacts c1 = new Contacts("Mani", "9650239588", new Address("city", "state", "country"));
		System.out.println("NAME ::: " + c1.getName() + "  Mobile ::: " + c1.getMobile());
		c1.getAddress().setCountry("country1");
		System.out.println(c1.toString());
		c1 = new Contacts("Gaurav", "9717031315", new Address("city", "state", "country"));
		System.out.println("NAME ::: " + c1.getName() + "  Mobile ::: " + c1.getMobile());
		System.out.println(isImmutable(c1));
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
