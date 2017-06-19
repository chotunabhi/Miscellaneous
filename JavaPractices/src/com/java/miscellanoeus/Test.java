package com.java.miscellanoeus;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String args[]) throws IOException {
		List<Dao> daos = new LinkedList<>();
		/*daos.add(new Dao(10, "abhi"));
		daos.add(new Dao(11, "gane"));
		daos.add(new Dao(12, "raju"));
		daos.add(new Dao(13, "ravi"));*/
		
		for (Dao dao : daos) {
			System.out.println(dao);
		}
		System.out.println("done");
//		System.out.println(daos.get(0));

//		System.out.println(synchronizedSet);
//		daos.forEach(x -> System.out.println(x.name));
//		Generic<List<Dao>> g = new Generic<>();
//		g.setField(daos);
		
//		System.out.println(g.getField());
		
/*		Dao dao = new Dao(10, "");
		Deer deer = new  Deer(dao);
		deer = null;
		
		Runtime.getRuntime().gc();*/
		
	}
}
