package com.java.miscellanoeus;

public class Dao {
	int age;
	String name;
	public Dao(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public void finalize(){
		System.out.println("DAO === gc done");
		
	}
}
