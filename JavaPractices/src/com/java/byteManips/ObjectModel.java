package com.java.byteManips;

import java.io.Serializable;
import java.util.List;

public class ObjectModel implements Serializable{
	private int i;
	private String j;
	
	List<ObjectModel> childs;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getJ() {
		return j;
	}

	public void setJ(String j) {
		this.j = j;
	}

	public List<ObjectModel> getChilds() {
		return childs;
	}

	public void setChilds(List<ObjectModel> childs) {
		this.childs = childs;
	}
}
