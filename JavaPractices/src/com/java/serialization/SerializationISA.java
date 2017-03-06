package com.java.serialization;

import java.io.Serializable;
import java.util.Set;

public class SerializationISA implements Serializable{
	int a;
	InnerSerializableClass innerSerializableClass;
	
	public InnerSerializableClass getInnerSerializableClass() {
		return innerSerializableClass;
	}
	public void setInnerSerializableClass(
			InnerSerializableClass innerSerializableClass) {
		this.innerSerializableClass = innerSerializableClass;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
