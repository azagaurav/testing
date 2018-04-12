package com.test.java.thread;

public interface IBuffer {
    public void write(String value);
    public void cleanUp();
    public int size();
}
