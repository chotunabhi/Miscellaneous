package com.java.miscellanoeus;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VariableParams {
	public static void printVariableParam(String ...strings){
		for (String string : strings) {
			System.out.print(string+"\t");
		}
		System.out.println(strings.length);
		for (int i=0;i<strings.length;i++) {
			System.out.print(strings[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printVariableParam("a","b","c","a","b","c");
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
//		System.out.println(list);
		Set<String> testSet = new HashSet<>();
//		testSet.addAll(list);
//		System.out.println(testSet);
		
		String listOfString = "";
		for(String s:listOfString.split(","))
				System.out.println(s);;
	}

}
