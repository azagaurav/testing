package com.test.design.patterns.sigleton;

/*
 * To overcome this situation with Reflection, we have to use Enum to
 * implement Singleton design pattern as Java ensures that any enum value is
 * instantiated only once in a Java program. Since Java Enum values are
 * globally accessible, so is the singleton. The drawback is that the enum
 * type is somewhat inflexible; for example, it does not allow lazy
 * initialization.
 */
public enum EnumSingleton {
	
    INSTANCE;
    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}