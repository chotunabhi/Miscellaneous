package com.java.miscellanoeus;

public class Deer {
	Dao dao = null;
	
	public Deer() {
		
		System.out.print("Deer");
	}

	public Deer(Dao dao) {
		this.dao = dao;
//		System.out.print("DeerAge");
	}

	private boolean hasHorns() {
		return false;
	}
	
	@Override
	public void finalize(){
		dao = null;
		Runtime.getRuntime().gc();
		System.out.println("gc done");
	}
}