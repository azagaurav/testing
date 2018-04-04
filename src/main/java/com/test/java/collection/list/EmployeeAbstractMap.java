package com.test.collection.list;

import java.util.Iterator;

public abstract class EmployeeAbstractMap<K,V> implements EmployeeMap<K, V> {

	public int size() {
        return entrySet().size();
    }
	
	public boolean isEmpty() {
        return size() == 0;
    }
	
	public boolean containsKey(Object key) {
        Iterator<EmployeeMap.EmployeeEntry<K,V>> i = entrySet().iterator();
        if (key==null) {
            while (i.hasNext()) {
                EmployeeEntry<K,V> e = i.next();
                if (e.getKey()==null)
                    return true;
            }
        } else {
            while (i.hasNext()) {
            	EmployeeEntry<K,V> e = i.next();
                if (key.equals(e.getKey()))
                    return true;
            }
        }
        return false;
    }
	public boolean containsValue(Object value) {
        Iterator<EmployeeEntry<K,V>> i = entrySet().iterator();
        if (value==null) {
            while (i.hasNext()) {
            	EmployeeEntry<K,V> e = i.next();
                if (e.getValue()==null)
                    return true;
            }
        } else {
            while (i.hasNext()) {
            	EmployeeEntry<K,V> e = i.next();
                if (value.equals(e.getValue()))
                    return true;
            }
        }
        return false;
    }
	
	public V get(Object key) {
        Iterator<EmployeeEntry<K,V>> i = entrySet().iterator();
        if (key==null) {
            while (i.hasNext()) {
            	EmployeeEntry<K,V> e = i.next();
                if (e.getKey()==null)
                    return e.getValue();
            }
        } else {
            while (i.hasNext()) {
            	EmployeeEntry<K,V> e = i.next();
                if (key.equals(e.getKey()))
                    return e.getValue();
            }
        }
        return null;
    }
	
	public V put(K key, V value) {
        throw new UnsupportedOperationException();
    }
	
	public V remove(Object key) {
        Iterator<EmployeeEntry<K,V>> i = entrySet().iterator();
        EmployeeEntry<K,V> correctEntry = null;
        if (key==null) {
            while (correctEntry==null && i.hasNext()) {
            	EmployeeEntry<K,V> e = i.next();
                if (e.getKey()==null)
                    correctEntry = e;
            }
        } else {
            while (correctEntry==null && i.hasNext()) {
            	EmployeeEntry<K,V> e = i.next();
                if (key.equals(e.getKey()))
                    correctEntry = e;
            }
        }

        V oldValue = null;
        if (correctEntry !=null) {
            oldValue = correctEntry.getValue();
            i.remove();
        }
        return oldValue;
    }
}
