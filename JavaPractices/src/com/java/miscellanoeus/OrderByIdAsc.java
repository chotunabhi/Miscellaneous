package com.java.miscellanoeus;

import java.util.Comparator;


public class OrderByIdAsc implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		Integer i1 = Integer.parseInt(o1);
		Integer i2 = Integer.parseInt(o2);
		
		return i1.compareTo(i2);
	}

}
