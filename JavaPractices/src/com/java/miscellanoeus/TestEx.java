package com.java.miscellanoeus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List list = new ArrayList();
		System.out.print("Start");
		
		for(int i=0;i<=list.size();i++)
			list.add(i);
		
		System.out.println("End");*/
		
		/*int i = 0;
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				i++;
				if(i%10==0){
					System.out.println("done");
					System.exit(0);
				}
			}}).start();
*/		
		List<String> list = new  ArrayList(Arrays.asList("hello","wordl"));
		
		for (String str : list) {
			if(str.startsWith("w"))
				list.remove(str);
		}
		/*
		String str = "HelloWorld";
		
		System.out.println(str.toUpperCase().substring(2,5).charAt(1));
		List list = new ArrayList<>(50);
		list.add(5);
//		System.out.print(list);
		s1(list);
		System.out.print(list);
		s2(list);
		System.out.print(list);
//		s1(list);
//		System.out.println(list.size());

		A a = new B();
		a.m1();
		a.m*/
	}
	
	public static void s1(List b){
		b.add(10);
	}
	
	public static void s2(List b){
		b = new ArrayList();
		b.add(15);
	}

}
