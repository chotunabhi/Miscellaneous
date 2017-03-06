package com.java.miscellanoeus;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String args[]) throws IOException {
		List<Dao> daos = new LinkedList<>();
		daos.add(new Dao(10, "abhi"));
		daos.add(new Dao(11, "gane"));
		daos.add(new Dao(12, "raju"));
		daos.add(new Dao(13, "ravi"));
		
		Generic<List<Dao>> g = new Generic<>();
		g.setField(daos);
		
		System.out.println(g.getField());
	}
}
