package com.test.design.patterns.sigleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMain {
	
	@SuppressWarnings("rawtypes")
	public static void main(String [] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		System.out.println("---------------------EagerSingleton-------------------");
		System.out.println(EagerSingleton.getEagerSingletonInstance());
		System.out.println(EagerSingleton.getEagerSingletonInstance());
		System.out.println("---------------------LazySingleton-------------------");
		System.out.println(LazySingleton.getLazySingleton());
		System.out.println(LazySingleton.getLazySingleton());
		System.out.println("----------------------------------------");
		System.out.println(StaticBlockSingleton.getStaticBlockSingleton());
		System.out.println(StaticBlockSingleton.getStaticBlockSingleton());
		System.out.println("----------------------------------------");
		System.out.println(ThreadSafeSingleton.getEagerThreadSafeSingleton());
		System.out.println(ThreadSafeSingleton.getLazyThreadSafeSingleton());
		System.out.println(ThreadSafeSingleton.getInstanceUsingDoubleLocking());
		System.out.println("----------------------------------------");
		System.out.println(SingletonPriorJAVA5.getSingletonPriorJAVA5());
		System.out.println(SingletonPriorJAVA5.getSingletonPriorJAVA5());
		System.out.println("------------------SerializationBreakSingleton----------------------");
		SerializationBreakSingleton sbs = SerializationBreakSingleton.getSerializationBreakSingleton();
		ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("SerializationBreakSingleton.ser"));
		oo.writeObject(sbs);
		oo.close();
		ObjectInput oi = new ObjectInputStream(new FileInputStream("SerializationBreakSingleton.ser"));
		SerializationBreakSingleton sbs2 = (SerializationBreakSingleton)oi.readObject();
		oi.close();
		System.out.println(sbs);
		System.out.println(sbs2);
		System.out.println("------------------ReflectionBreakSingleton----------------------");
		ReflectionBreakSingleton rbs1 = ReflectionBreakSingleton.getReflectionBreakSingleton();
		ReflectionBreakSingleton rbs2 = null;
		Constructor [] constructors = ReflectionBreakSingleton.class.getDeclaredConstructors();
		for(Constructor constructor : constructors){
			constructor.setAccessible(true);
			try {
				rbs2 = (ReflectionBreakSingleton) constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException
					| IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(rbs1);
		System.out.println(rbs2);
		System.out.println("------------------SingletonEnum----------------------");
		
		EnumSingleton singleton = EnumSingleton.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
		
	}

}
