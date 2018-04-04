package com.test.thread;

public interface IBuffer {
    public void write(String value);
    public void cleanUp();
    public int size();
}
