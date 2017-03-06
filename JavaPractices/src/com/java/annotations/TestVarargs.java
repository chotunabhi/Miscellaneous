package com.java.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestVarargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String []a = {"a","b"};
//		varArg(a);
	HashMap<String,Object> testHash = new HashMap<String, Object>();
		testHash.put("1", "One");
		testHash.put("2", null);
		testHash.put("3", null);
		
		List<String> ids = new ArrayList<>();
//		ids.add(")
		
		System.out.println(testHash.get("4"));
	}
	public static void varArg(String... strings){
		for (String string : strings) {
			System.out.println(string);
		}
	}

}
