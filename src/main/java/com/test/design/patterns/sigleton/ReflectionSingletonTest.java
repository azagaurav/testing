package com.test.design.patterns.sigleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerSingleton instanceOne = EagerSingleton.getEagerSingletonInstance();
        EagerSingleton instanceTwo = new EagerSingleton();
        try {
            @SuppressWarnings("rawtypes")
			Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (@SuppressWarnings("rawtypes") Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
